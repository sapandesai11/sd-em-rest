/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.Roles;

/**
 * @author PC Doctor.com
 *
 */
public interface RolesServices {
	
	List<Roles> findByAll();
	
	Roles findByRoleName(String roleName);
	
	Roles findById(int id);
	
	Roles save(Roles role);

}
