/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.Roles;
import com.sd.em.rest.repositories.RolesRepository;
import com.sd.em.rest.services.RolesServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("rolesServices")
public class RolesServiceImpl implements RolesServices {

	@Autowired
	RolesRepository rolesRepository;
	
	@Override
	public Roles findByRoleName(String roleName) {
		return rolesRepository.findByRoleName(roleName);
	}

	@Override
	public Roles findById(int id) {
		return rolesRepository.findByRoleId(id);
	}

	@Override
	public Roles save(Roles role) {
		return rolesRepository.save(role);
	}

	@Override
	public List<Roles> findByAll() {
		return (List<Roles>) rolesRepository.findAll();
	}

}
