package com.webApp.controller;


import com.webApp.entity.Jelo;
import com.webApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Devon Ravihansa on 8/29/2017.
 */
@Controller
public class DefaultController {

    @Autowired
    private ProductRepository productRepository;

  
    @GetMapping("/cart")
    public String shop(Model model){
        model.addAttribute("jela", productRepository.findAll());
        return "cart";
    }

    


    @RequestMapping("/product/{id}")
    public String product(@PathVariable("id")Jelo jelo, Model model){
        model.addAttribute("jelo", jelo);
        return "product";
    }
}
