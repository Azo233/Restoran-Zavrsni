/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webApp.service;

import com.webApp.entity.Narudzba;
import java.util.List;

/**
 *
 * @author Andrija
 */
public interface NarudzbaService {
    
    List<Narudzba> getAllNarudzba();
    Narudzba saveNarudzba(Narudzba narudzba);
    
}
