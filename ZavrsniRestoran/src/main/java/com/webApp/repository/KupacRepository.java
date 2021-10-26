package com.webApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webApp.entity.User;

public interface KupacRepository extends JpaRepository<User, Long> {
	
	

}
