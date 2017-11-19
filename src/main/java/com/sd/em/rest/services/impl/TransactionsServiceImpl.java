/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.Categories;
import com.sd.em.rest.domain.PaymentMethods;
import com.sd.em.rest.domain.Transactions;
import com.sd.em.rest.repositories.TransactionsRepository;
import com.sd.em.rest.services.TransactionsServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("transactionsServices")
public class TransactionsServiceImpl implements TransactionsServices {
	
	@Autowired
	TransactionsRepository transactionsRepository;

	@Override
	public List<Transactions> findByCategory(Categories category) {
		return transactionsRepository.findByCategory(category);
	}

	@Override
	public Transactions findByTransactionsId(int id) {
		return transactionsRepository.findOne(id);
	}

	@Override
	public List<Transactions> findByPaymentMethod(PaymentMethods paymentMethod) {
		return transactionsRepository.findByPaymentMode(paymentMethod);
	}

	@Override
	public Transactions save(Transactions transaction) {
		return transactionsRepository.save(transaction);
	}

	@Override
	@Transactional
	public List<Transactions> findAll() {
		return (List<Transactions>) transactionsRepository.findAll();
	}

}
