/**
 * 
 */
package com.sd.em.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author PC Doctor.com
 *
 */
@SpringBootApplication(scanBasePackages={"com.sd.em.rest"})
@EnableJpaRepositories(basePackages = "com.sd.em.rest.repositories")
@EntityScan(basePackages = {"com.sd.em.rest.domain"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
