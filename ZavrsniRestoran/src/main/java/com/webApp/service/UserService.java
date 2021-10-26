package com.webApp.service;

import com.webApp.entity.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.webApp.entity.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
