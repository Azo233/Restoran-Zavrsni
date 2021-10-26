package com.webApp.serviceImpl;
import org.springframework.stereotype.Service;


import com.webApp.repository.KupacRepository;
import com.webApp.service.*;
import antlr.collections.List;
import com.webApp.entity.User;

@Service
public class KupacServiceImpl implements KupacService {

	private KupacRepository kupacRepository;
	
	public KupacServiceImpl(KupacRepository kupacRepository) {
		super();
		this.kupacRepository = kupacRepository;
	}
	
        @Override
        public java.util.List<User> getAllUsers() {
          return kupacRepository.findAll();  
        }

    @Override
    public User saveUser(User user) {
        return kupacRepository.save(user);
    }


}
