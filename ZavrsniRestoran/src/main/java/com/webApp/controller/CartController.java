package com.webApp.controller;

import com.webApp.entity.Cart;
import com.webApp.serviceImpl.CartManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.webApp.entity.Jelo;
import com.webApp.service.NarudzbaService;

import javax.servlet.http.HttpSession;

/**
 * Created by Devon Ravihansa on 8/29/2017.
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartManager cartManager;
    private NarudzbaService narudzbaService;
    private Cart cart;

    @RequestMapping("/add")
    public String add(HttpSession session, @RequestParam("id_jelo") Jelo jelo,
                             @RequestParam(value = "qty", required = false, defaultValue = "1") int qty){
        Cart cart = cartManager.getCart(session);
        cart.addItem(jelo, qty);
        return "redirect:/cart";
    }

    @RequestMapping("/remove")
    public String remove(HttpSession session, @RequestParam("id_jelo") Jelo jelo){
        Cart cart = cartManager.getCart(session);
        cart.removeItem(jelo);
        return "cart";
    }

    @RequestMapping("/update")
    public String update(HttpSession session, @RequestParam("id_jelo") Jelo jelo, @RequestParam("qty") int qty){
        Cart cart = cartManager.getCart(session);
        cart.updateItem(jelo, qty);
        return "cart";
    }
        @RequestMapping(value = "/cart")
       public String openNarudzba(){
           if(cart==null){
             return "message";  
           }
           return "redirect:/message"; 
   }
}
