/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webApp.serviceImpl;

import com.webApp.entity.Narudzba;
import com.webApp.repository.NarudzbaRepository;
import com.webApp.service.NarudzbaService;
import java.util.List;

/**
 *
 * @author Andrija
 */
public class NarudzbaServiceImpl implements NarudzbaService{
    
    private NarudzbaRepository narudzbaRepository;

    public NarudzbaServiceImpl(NarudzbaRepository narudzbaRepository) {
        this.narudzbaRepository = narudzbaRepository;
    }

    @Override
    public List<Narudzba> getAllNarudzba() {
        return narudzbaRepository.findAll();
    }

    @Override
    public Narudzba saveNarudzba(Narudzba narudzba) {
        return narudzbaRepository.save(narudzba);
        
    }

    @Override
    public List<Narudzba> checkForMeal() {
        return narudzbaRepository.findAll();   
    }
    
    
    
    
    
}
