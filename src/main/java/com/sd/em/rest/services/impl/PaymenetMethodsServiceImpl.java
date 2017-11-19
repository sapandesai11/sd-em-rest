/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.PaymentMethods;
import com.sd.em.rest.repositories.PaymentMethodsRepositories;
import com.sd.em.rest.services.PaymentMethodsServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("paymentMethodsServices")
public class PaymenetMethodsServiceImpl implements PaymentMethodsServices {

	@Autowired
	PaymentMethodsRepositories paymentMethodsRepositories;
	
	@Override
	public List<PaymentMethods> findAll() {
		return (List<PaymentMethods>) paymentMethodsRepositories.findAll();
	}

	@Override
	public PaymentMethods findById(int id) {
		return paymentMethodsRepositories.findOne(id);
	}

	@Override
	@Transactional
	public PaymentMethods save(PaymentMethods paymentMethod) {
		return paymentMethodsRepositories.save(paymentMethod);
	}

}
