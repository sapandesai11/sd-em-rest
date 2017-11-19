/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.Users;


/**
 * @author PC Doctor.com
 *
 */
public interface UsersServices {
	
	List<Users> findAll();
	
	Users findByUsername(String username);
	
	Users findByUserid(int userid);
	
	Users findByEmail(String email);
	
	Users save(Users user);

}
