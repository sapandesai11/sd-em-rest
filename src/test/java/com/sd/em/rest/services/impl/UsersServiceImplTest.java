/**
 * 
 */
package com.sd.em.rest.services.impl;


import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.em.rest.config.Application;
import com.sd.em.rest.domain.Roles;
import com.sd.em.rest.domain.User;
import com.sd.em.rest.services.RolesServices;
import com.sd.em.rest.services.UsersServices;

/**
 * @author PC Doctor.com
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@TestPropertySource(locations= "classpath:application-test.properties")
public class UsersServiceImplTest {

	@Autowired
	UsersServices usersServices;
	
	@Autowired
	RolesServices rolesServices;
	
	
	User user;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		user = new User();
		Set<Roles> roles = new LinkedHashSet<>();
		roles.add(rolesServices.findByAll().get(1));
		user.setUsername("Sapan");
		user.setEmail("test@gmail.com");
		user.setFirstName("S");
		user.setLastName("D");
		user.setPassword("dummy");
		user.setRole(roles);
	}

	@Test
	public void testUserSave() {
		usersServices.save(user);
	}

}
