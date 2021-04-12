package com.cognizant.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @SpringBootApplication is used in our application or main class to enable a
 *                        host of features, e.g. Java-based Spring
 *                        configuration, component scanning, and in particular
 *                        for enabling Spring Boot's auto-configuration feature.
 *
 */
@SpringBootApplication
public class AuthorizationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationMicroserviceApplication.class, args);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		MyFilter myFilter = new MyFilter();
		filterRegistrationBean.setFilter(myFilter);
		return filterRegistrationBean;
	}
}
