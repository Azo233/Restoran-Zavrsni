/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Andrija
 */
@Controller
public class MainController {
    
      @GetMapping("/login")
            public String login(){
                return "login";
            }
            
       @GetMapping("/")
            public String home(){
                return "home";
            }    
}
