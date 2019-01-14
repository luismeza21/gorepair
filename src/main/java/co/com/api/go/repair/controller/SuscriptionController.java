package co.com.api.go.repair.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.api.go.repair.model.Suscription;
import co.com.api.go.repair.service.SuscriptionService;

@RestController
@RequestMapping(value = "/api/v1/go/repair/")
public class SuscriptionController {

	public static final Logger log = LoggerFactory.getLogger(SuscriptionController.class);

	@Autowired
	SuscriptionService suscriptionService;

	@RequestMapping(value = "get/suscription", method = RequestMethod.GET, produces = "application/json")
	public List<Suscription> getSuscriptionActive() {
		List<Suscription> suscription = null;
		try {
			suscription = suscriptionService.getAllSuscription();
			if(suscription.isEmpty()) {
				log.info("No ha suscripciones disponibles");
			}
		} catch (Exception e) {
			log.error("Error al consultar service {}", e);
		}
		return suscription;
	}

}
