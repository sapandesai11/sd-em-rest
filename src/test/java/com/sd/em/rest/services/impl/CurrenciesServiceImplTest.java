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
import com.sd.em.rest.domain.Currency;
import com.sd.em.rest.services.CurrenciesServices;

/**
 * @author PC Doctor.com
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@TestPropertySource(locations= "classpath:application-test.properties")
public class CurrenciesServiceImplTest {
	
	@Autowired
	CurrenciesServices currenciesServices;
	
	Currency currency;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		currency = new Currency();
		currency.setName("INR");
	}

	@Test
	public void testCurrencySave() {
		currenciesServices.save(currency);
	}

}
