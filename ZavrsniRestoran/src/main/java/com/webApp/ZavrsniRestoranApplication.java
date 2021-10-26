package com.webApp;

import com.webApp.controller.JelovnikController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.webApp.entity.Jelo;
import com.webApp.entity.User;
import com.webApp.repository.JeloRepository;
import com.webApp.repository.KupacRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.webApp"})
@EntityScan("com.webApp.entity")
@EnableJpaRepositories("com.webApp.repository")
public class ZavrsniRestoranApplication   {

	public static void main(String[] args) {
            SpringApplication.run(ZavrsniRestoranApplication.class, args);
	}
	

	
   

}
