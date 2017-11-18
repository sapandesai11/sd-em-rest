/**
 * 
 */
package com.sd.em.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


/**
 * @author PC Doctor.com
 *
 */
@SpringBootApplication(scanBasePackages={"com.sd.em.rest"})
@EntityScan(basePackages = {"com.sd.em.rest.domain"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
