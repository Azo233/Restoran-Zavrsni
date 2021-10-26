package com.webApp.service;


import java.util.List;

import com.webApp.entity.User;
import org.springframework.stereotype.Component;
@Component
public interface KupacService {
	
	List<User> getAllUsers();
	User saveUser(User user);
}
