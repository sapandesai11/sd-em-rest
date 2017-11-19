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
import com.sd.em.rest.domain.Categories;
import com.sd.em.rest.services.CategoriesServices;

/**
 * @author PC Doctor.com
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@TestPropertySource(locations= "classpath:application-test.properties")
public class CategoriesServiceImplTest {

	
	@Autowired
	CategoriesServices categoriesServices;
	
	Categories category;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		category = new Categories();
		category.setName("Dummy Category");
		
	}

	@Test
	public void testCategorySave() {
		categoriesServices.save(category);
	}

}
