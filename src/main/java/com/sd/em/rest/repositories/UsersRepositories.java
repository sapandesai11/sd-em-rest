/**
 * 
 */
package com.sd.em.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.Users;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface UsersRepositories extends CrudRepository<Users, Integer> {
	
	List<Users> findAll();
	
	Users findByUsername(String username);
	
	Users findByUserid(int userid);
	
	Users findByEmail(String email);
	
	@SuppressWarnings("unchecked")
	Users save(Users user);

}
