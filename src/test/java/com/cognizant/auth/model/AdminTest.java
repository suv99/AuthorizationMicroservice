package com.cognizant.auth.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * the class tests all the setters and getters and constructors for the admin
 * details
 *
 */

public class AdminTest {

	Admin admin = new Admin();

	@Test
	public void testSetUserId() {
		admin.setUserid("1");
		assertEquals("1", admin.getUserid());
	}

	@Test
	public void testGetUserId() {
		admin.setUserid("1");
		assertEquals("1", admin.getUserid());
	}

	@Test
	public void testSetUserName() {
		admin.setUname("admin");
		assertEquals("admin", admin.getUname());
	}

	@Test
	public void testGetUserName() {
		admin.setUname("admin");
		assertEquals("admin", admin.getUname());
	}

	@Test
	public void testSetUserPassword() {
		admin.setUpassword("password");
		assertEquals("password", admin.getUpassword());
	}

	@Test
	public void testGetUserPassword() {
		admin.setUpassword("password");
		assertEquals("password", admin.getUpassword());
	}

	@Test
	public void testSetAuthToken() {
		admin.setAuthToken("authToken");
		assertEquals("authToken", admin.getAuthToken());
	}

	@Test
	public void testGetAuthToken() {
		admin.setAuthToken("authToken");
		assertEquals("authToken", admin.getAuthToken());
	}

	@Test
	public void testAdminStringStringStringString() {
		Admin admin = new Admin("userid", "upassword", "uname", "authToken");
		assertEquals("uname", admin.getUname());
	}

}
