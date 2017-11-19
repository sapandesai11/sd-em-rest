/**
 * 
 */
package com.sd.em.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.Categories;
import com.sd.em.rest.domain.PaymentMethods;
import com.sd.em.rest.domain.Transactions;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {
	
	List<Transactions> findByCategory(Categories category);
	
	List<Transactions> findByPaymentMode(PaymentMethods paymentMode);

}
