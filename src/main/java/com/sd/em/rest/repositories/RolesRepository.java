/**
 * 
 */
package com.sd.em.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.Roles;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface RolesRepository extends CrudRepository<Roles, Integer> {
	
	Roles findByRoleName(String rolename);
	
	Roles findByRoleId(int id);
	
	@SuppressWarnings("unchecked")
	Roles save(Roles role);

}
