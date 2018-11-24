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
import com.sd.em.rest.domain.Transactions;
import com.sd.em.rest.services.CategoriesServices;
import com.sd.em.rest.services.CurrenciesServices;
import com.sd.em.rest.services.PaymentMethodsServices;
import com.sd.em.rest.services.TransactionsServices;
import com.sd.em.rest.services.UsersServices;

/**
 * @author PC Doctor.com
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@TestPropertySource(locations= "classpath:application-test.properties")
public class TransactionsServiceImplTest {

	@Autowired
	TransactionsServices transactionsServices;
	
	@Autowired
	PaymentMethodsServices paymentMethodsServices;
	
	@Autowired
	CategoriesServices categoriesServices;
	
	@Autowired
	CurrenciesServices currenciesServices;
	
	@Autowired
	UsersServices usersServices;
	
	Transactions transaction;
	
	/*PaymentMethods pmode;
	
	Currency currency;
	
	Categories category;
	
	User user;*/
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception { 
		transaction = new Transactions();
		/*currency = new Currency();
		category = new Categories();
		user = new User();*/
		transaction.setAmount(100);
		transaction.setCategory(categoriesServices.findByAll().get(0));
		transaction.setCurrency(currenciesServices.findAll().get(0));
		transaction.setPaymentMode(paymentMethodsServices.findAll().get(0));
		transaction.setOwner(usersServices.findAll().get(0));
		
	}

	@Test
	public void testTransactionsSave() {
		transactionsServices.save(transaction);
	}

}
