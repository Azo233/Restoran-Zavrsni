package com.webApp.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import com.webApp.service.JeloService;
import com.webApp.service.NarudzbaService;


@Controller
public class JelovnikController {
	
	private JeloService jeloService;
        private NarudzbaService narudzbaService;

    
	
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
    
    
   

}
       

