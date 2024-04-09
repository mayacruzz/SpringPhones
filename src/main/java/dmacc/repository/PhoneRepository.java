package dmacc.repository;

import org.springframework.stereotype.Repository;

import dmacc.beans.Phone;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 9, 2024
 */

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> { 
	
}