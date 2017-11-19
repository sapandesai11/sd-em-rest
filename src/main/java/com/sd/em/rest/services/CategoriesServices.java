/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.Categories;

/**
 * @author PC Doctor.com
 *
 */
public interface CategoriesServices {
	
	List<Categories> findByAll();
	
	Categories findById(int id);
	
	Categories save(Categories category);

}
