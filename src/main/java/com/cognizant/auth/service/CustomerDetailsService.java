package com.cognizant.auth.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.auth.model.Admin;
import com.cognizant.auth.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * service class that implements the interface UserDetailsService that includes
 * user details method definitions
 * 
 * @Slf4j (Simple Logging Facade for Java) provides a simple abstraction of all
 *        the logging frameworks
 *
 */
@Service
@Slf4j
public class CustomerDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * Locates the user based on the username returns the core user information
	 */
	@Override
	public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
		log.debug("Start : {}", "loadUserByUsername");
		Admin custuser = userRepository.findById(uid).orElse(null);
		log.debug("End : {}", "loadUserByUsername");
		return new User(custuser.getUserid(), custuser.getUpassword(), new ArrayList<>());
	}

}
