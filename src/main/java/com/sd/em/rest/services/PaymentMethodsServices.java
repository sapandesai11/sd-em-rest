/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.PaymentMethods;

/**
 * @author PC Doctor.com
 *
 */
public interface PaymentMethodsServices {

	List<PaymentMethods> findAll();
	
	PaymentMethods findById(int id);
	
	PaymentMethods save(PaymentMethods paymentMethod);
	
}
