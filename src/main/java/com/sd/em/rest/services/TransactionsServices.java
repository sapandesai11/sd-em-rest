/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.Categories;
import com.sd.em.rest.domain.PaymentMethods;
import com.sd.em.rest.domain.Transactions;

/**
 * @author PC Doctor.com
 *
 */
public interface TransactionsServices {
	
	List<Transactions> findAll();
	
	List<Transactions> findByCategory(Categories category);
	
	Transactions findByTransactionsId(int id);
	
	List<Transactions> findByPaymentMethod(PaymentMethods paymentMethod);
	
	Transactions save(Transactions transaction);
}
