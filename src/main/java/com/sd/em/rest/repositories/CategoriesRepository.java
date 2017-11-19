/**
 * 
 */
package com.sd.em.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.Categories;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
