/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.Users;
import com.sd.em.rest.repositories.UsersRepositories;
import com.sd.em.rest.services.UsersServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("usersServices")
public class UsersServiceImpl implements UsersServices {
	
	@Autowired
	UsersRepositories usersRepository;

	@Override
	public List<Users> findAll() {
		return usersRepository.findAll();
	}

	@Override
	public Users findByUsername(String username) {
		return usersRepository.findByUsername(username);
	}

	@Override
	public Users findByUserid(int userid) {
		return usersRepository.findByUserid(userid);
	}

	@Override
	public Users findByEmail(String email) {
		return usersRepository.findByEmail(email);
	}

	@Override
	@Transactional
	public Users save(Users user) {
		return usersRepository.save(user);
	}

}
