/**
 * 
 */
package com.sd.em.rest.services.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.em.rest.config.Application;
import com.sd.em.rest.domain.Roles;
import com.sd.em.rest.services.RolesServices;


/**
 * @author PC Doctor.com
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@TestPropertySource(locations= "classpath:application-test.properties")
public class RolesServicesImplTest {
	
	@Autowired
	RolesServices rolesServices;
	
	Roles role;
	
	@Before
	public void setup() {
		role = new Roles();
		role.setRoleName("ROLE_ADMIN");
	}
	
	@Test
	public void testRoleSave() {
		rolesServices.save(role);
	}

}
