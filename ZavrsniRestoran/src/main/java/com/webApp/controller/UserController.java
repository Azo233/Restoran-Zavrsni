package com.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.webApp.entity.User;
import com.webApp.service.KupacService;

@Controller
public class UserController {
	
	private KupacService kupacService;

	public UserController(KupacService kupacService) {
		super();
		this.kupacService = kupacService;
	}
	
	@GetMapping("/kupci")
	public String listKupac(Model model) {
		model.addAttribute("Kupac", kupacService.getAllUsers());
		return "jelovnik";
	}
	
	@GetMapping("/kupci/new")
	public String createKupac(Model model) {
		
		User user= new User();
		model.addAttribute("user", user);
		return "cart";
	}
        
      
        

    @PostMapping("/kupci")
    public String saveStudent(@ModelAttribute("user") User user) {
 	   kupacService.saveUser(user);
 	   return "jelovnik";
    }
}
