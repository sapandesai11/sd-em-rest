/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.User;


/**
 * @author PC Doctor.com
 *
 */
public interface UsersServices {
	
	List<User> findAll();
	
	User findByUsername(String username);
	
	User findByUserid(int userid);
	
	User findByEmail(String email);
	
	User save(User user);
	
	void delete(List<User> userList);

}
