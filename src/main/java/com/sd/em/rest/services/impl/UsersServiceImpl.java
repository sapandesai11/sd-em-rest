/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.User;
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
	public List<User> findAll() {
		return usersRepository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		return usersRepository.findByUsername(username);
	}

	@Override
	public User findByUserid(int userid) {
		return usersRepository.findByUserid(userid);
	}

	@Override
	public User findByEmail(String email) {
		return usersRepository.findByEmail(email);
	}

	@Override
	@Transactional
	public User save(User user) {
		return usersRepository.save(user);
	}

	@Override
	@Transactional
	public void delete(List<User> userList) {
		usersRepository.delete(userList);
	}

}
