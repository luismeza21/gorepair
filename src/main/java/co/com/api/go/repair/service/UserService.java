package co.com.api.go.repair.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.api.go.repair.model.User;
import co.com.api.go.repair.repository.IUserRepository;

@Service
public class UserService {
	
	private static Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	IUserRepository userRepository;
	
	public List<User> getAllUser() {
		List<User> user = null;
		try {
			user = userRepository.findAll();

		} catch (Exception e) {
			log.error("Problemas al consultar clientes {}", e);
		}
		return user;
	}
	

}
