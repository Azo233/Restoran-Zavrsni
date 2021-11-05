package com.webApp.repository;

import com.webApp.entity.Jelo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Jelo, Long> {
    
}
