/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webApp.controller;

import com.webApp.entity.Narudzba;
import com.webApp.service.JeloService;

import com.webApp.service.NarudzbaService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Andrija
 */
@Controller

public class NarudzbaControler {
  private NarudzbaService narudzbaService;
  private JeloService jeloService;

    public NarudzbaControler(NarudzbaService narudzbaService, JeloService jeloService) {
        super();
        this.narudzbaService = narudzbaService;
        this.jeloService = jeloService;
    }
  
    @RequestMapping(value = "/narudzba")
    public String showNarudzba(Model model){
        model.addAttribute("nb", narudzbaService.getAllNarudzba());
        return "narudzba";
    }
    
}
