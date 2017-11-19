/**
 * 
 */
package com.sd.em.rest.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.em.rest.domain.Currency;
import com.sd.em.rest.repositories.CurrenciesRepositories;
import com.sd.em.rest.services.CurrenciesServices;

/**
 * @author PC Doctor.com
 *
 */
@Service("currenciesServices")
public class CurrencyImpl implements CurrenciesServices {

	@Autowired
	CurrenciesRepositories currenciesRepositories;
	
	@Override
	public List<Currency> findAll() {
		return (List<Currency>) currenciesRepositories.findAll();
	}

	@Override
	public Currency findById(int id) {
		return currenciesRepositories.findOne(id);
	}

	@Override
	@Transactional
	public Currency save(Currency currency) {
		return currenciesRepositories.save(currency);
	}

}
