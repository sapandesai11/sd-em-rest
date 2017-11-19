/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.Categories;
import com.sd.em.rest.repositories.CategoriesRepository;
import com.sd.em.rest.services.CategoriesServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("categoriesServices")
public class CategoriesServiceImpl implements CategoriesServices {

	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Override
	public List<Categories> findByAll() {
		return (List<Categories>) categoriesRepository.findAll();
	}

	@Override
	public Categories findById(int id) {
		return categoriesRepository.findOne(id);
	}

	@Override
	@Transactional
	public Categories save(Categories category) {
		return categoriesRepository.save(category);
	}

}
