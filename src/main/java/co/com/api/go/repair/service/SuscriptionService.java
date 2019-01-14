package co.com.api.go.repair.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.api.go.repair.model.Suscription;
import co.com.api.go.repair.repository.ISuscriptionRepository;

@Service
public class SuscriptionService {

	public static final Logger log = LoggerFactory.getLogger(SuscriptionService.class);

	@Autowired
	ISuscriptionRepository suscriptionRepository;

	public List<Suscription> getAllSuscription() {
		List<Suscription> suscription = null;
		
		try {
			suscription = suscriptionRepository.findAll();
			if(!suscription.isEmpty()) {
				log.info("No hay suscripciones!");
			}
		} catch (Exception e) {

			log.error("Problemas al momento de consultar suscripciones");
		}
		return suscription;
	}

}
