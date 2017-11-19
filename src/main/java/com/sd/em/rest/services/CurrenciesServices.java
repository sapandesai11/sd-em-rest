/**
 * 
 */
package com.sd.em.rest.services;

import java.util.List;

import com.sd.em.rest.domain.Currency;

/**
 * @author PC Doctor.com
 *
 */
public interface CurrenciesServices {
	
	List<Currency> findAll();
	
	Currency findById(int id);
	
	Currency save(Currency currency);

}
