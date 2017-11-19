/**
 * 
 */
package com.sd.em.rest.services.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.sd.em.rest.config.Application;

/**
 * @author PC Doctor.com
 *
 */
@SpringBootTest(classes={Application.class})
@RunWith(Suite.class)
@Suite.SuiteClasses({
	   CurrenciesServiceImplTest.class,
	   CategoriesServiceImplTest.class,
	   PaymentMethodsServiceImplTest.class,
	   UserSuite.class,
	   TransactionsServiceImplTest.class
	})
@TestPropertySource(locations= "classpath:application-test.properties")
public class TransactionSuite {

}
