package com.cognizant.auth.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * the class tests all the setters and getters and constructors for the
 * Authorization response
 *
 */
public class AuthResponseTest {

	AuthResponse authResponse = new AuthResponse();

	@Test
	public void testSetUid() {
		authResponse.setUid("1");
		assertEquals("1", authResponse.getUid());
	}

	@Test
	public void testGetUid() {
		authResponse.setUid("1");
		assertEquals("1", authResponse.getUid());
	}

	@Test
	public void testSetName() {
		authResponse.setName("Admin");
		assertEquals("Admin", authResponse.getName());
	}

	@Test
	public void testGetName() {
		authResponse.setName("Admin");
		assertEquals("Admin", authResponse.getName());
	}

	@Test
	public void testSetValid() {
		authResponse.setValid(true);
		assertEquals(true, authResponse.isValid());
	}

	@Test
	public void testIsValid() {
		authResponse.setValid(true);
		assertEquals(true, authResponse.isValid());
	}

	@Test
	public void testAuthResponseStringStringBoolean() {
		AuthResponse authrespo = new AuthResponse("1", "Admin", true);
		assertEquals("Admin", authrespo.getName());
	}
}
