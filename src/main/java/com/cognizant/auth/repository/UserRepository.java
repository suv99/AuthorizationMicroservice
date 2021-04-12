package com.cognizant.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.auth.model.Admin;

/**
 * 
 * @Repository indicates that the class provides the mechanism for storage,
 *             retrieval, search, update and delete operation on objects
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Admin, String> {

}