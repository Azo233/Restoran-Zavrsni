package com.webApp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webApp.entity.Jelo;
import com.webApp.repository.JeloRepository;
import com.webApp.service.JeloService;

@Service
public class JeloServiceImpl implements JeloService {

	private JeloRepository jeloRepository;
	


	public JeloServiceImpl(JeloRepository jeloRepository) {
		super();
		this.jeloRepository = jeloRepository;
	}



	@Override
	public List<Jelo> getAllJelo() {
		return jeloRepository.findAll();
	}






}
