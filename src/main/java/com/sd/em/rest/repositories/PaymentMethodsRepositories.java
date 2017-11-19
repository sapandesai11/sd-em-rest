/**
 * 
 */
package com.sd.em.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.PaymentMethods;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface PaymentMethodsRepositories extends CrudRepository<PaymentMethods, Integer> {

}
