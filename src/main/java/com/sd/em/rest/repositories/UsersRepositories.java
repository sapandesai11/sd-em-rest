/**
 * 
 */
package com.sd.em.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.User;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface UsersRepositories extends CrudRepository<User, Integer> {
	
	List<User> findAll();
	
	User findByUsername(String username);
	
	User findByUserid(int userid);
	
	User findByEmail(String email);
	
	@SuppressWarnings("unchecked")
	User save(User user);

}
