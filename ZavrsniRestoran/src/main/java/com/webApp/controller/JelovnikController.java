package com.webApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webApp.entity.Jelo;
import com.webApp.repository.JeloRepository;
import com.webApp.service.JeloService;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JelovnikController {
	
	private JeloService jeloService;

    
	
public JelovnikController(JeloService jeloService) {
            super();
            this.jeloService = jeloService;
    }

    @RequestMapping(value = "/home")
    public String openindex(){
        return "home";
    }
       @RequestMapping(value = "/login")
    public String openLogin(){
        return "login";
    }
    @GetMapping("/jelovnik")
    public String listJelo(Model model) {
            model.addAttribute("jela", jeloService.getAllJelo());
            return "jelovnik";
    }
   
    @RequestMapping(value = "/narudzba")
       public String openNarudzba(){
       return "narudzba";
   }
       
 
	
    



	}
