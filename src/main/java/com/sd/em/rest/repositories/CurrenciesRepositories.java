/**
 * 
 */
package com.sd.em.rest.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.em.rest.domain.Currency;

/**
 * @author PC Doctor.com
 *
 */
@Repository
public interface CurrenciesRepositories extends CrudRepository<Currency, Integer> {
	
	/*List<Currency> findAll();
	
	Currency findById(int id);
	
	@SuppressWarnings("unchecked")
	Currency save(Currency currency);*/

}
