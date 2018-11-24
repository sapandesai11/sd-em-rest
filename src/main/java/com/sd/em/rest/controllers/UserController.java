/**
 * 
 */
package com.sd.em.rest.controllers;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sd.em.rest.domain.Response;
import com.sd.em.rest.domain.Roles;
import com.sd.em.rest.domain.User;
import com.sd.em.rest.exceptions.InternalServerError;
import com.sd.em.rest.exceptions.NotFoundException;
import com.sd.em.rest.services.UsersServices;


/**
 * @author Sapan.Desai
 * Generate the DTOs
 *
 */

@RestController
public class UserController {
	
	@Autowired
	UsersServices usersServices;

	// GET /users
	@GetMapping(value="/users")
	public Response getAllUsers() {
		Response response = new Response(HttpStatus.OK);
		List<User> userList = new ArrayList<>();
		userList = usersServices.findAll();
		// TODO Use DTOs instead of directly transferring data entities so that it does not impact API
		//		if DTOs are not used then any future database change may return modified entity and 
		//		consumers of this API need to be informed about the change 
		//		and they would have to make changes which is not desirable  
		response.setData(userList);
		return response;
	}

	// GET /users/{id}
	@GetMapping(value="/users/{id}")
	public Response getUserBYId(@PathVariable int id) {
		Response response = new Response(HttpStatus.OK);
		User user = usersServices.findByUserid(id);
		Optional.ofNullable(user).orElseThrow(() -> {throw new NotFoundException("User not found. User id is  " + id);});
		Resource<User> resource = new Resource<>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());
		resource.add(linkTo.withRel("all-users"));
		response.setData(resource);
		return response;
	}
	
	// DELETE /users/{id}
	@DeleteMapping(value="/users/{id}")
	public ResponseEntity<Response> deleteUser(@PathVariable int id) {
		Response response = new Response(HttpStatus.NO_CONTENT);
		User user = usersServices.findByUserid(id);
		Optional.ofNullable(user).orElseThrow(() -> {throw new NotFoundException("User not found. User id is " + id);});
		List<User> userList = new ArrayList<>();
		userList.add(Optional.of(user).get()); 
		usersServices.delete(userList);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
	}
	
	// POST /users
	@PostMapping(value="/users")
	public ResponseEntity<Response> createAndUpdateUser(@Valid @RequestBody User user) {
		Response response = new Response(HttpStatus.CREATED);
		Set<Roles> roles = new LinkedHashSet<>();
		roles.add(new Roles(2, "ROLE_USER"));
		user.setRole(roles);
		try {
			User createdUser = usersServices.save(user);
			response.setData(createdUser);
		}catch (DataIntegrityViolationException ex) {
			throw new InternalServerError(ex.getCause().getCause().getMessage());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
