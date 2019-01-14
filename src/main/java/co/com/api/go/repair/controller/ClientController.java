package co.com.api.go.repair.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.api.go.repair.config.GoConstant;
import co.com.api.go.repair.domain.ResponseMechanic;
import co.com.api.go.repair.model.Client;
import co.com.api.go.repair.service.ClientService;

@RestController
@RequestMapping(value = "/api/v1/go/repair/")
public class ClientController {

	public static final Logger log = LoggerFactory.getLogger(ClientController.class);

	@Autowired
	ClientService clientService;

	@RequestMapping(value = "get/clients", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getAllClient() {
		List<Client> client = null;
		try {
			client = clientService.getAllClient();

		} catch (Exception e) {
			log.error("Problemas al consultar clientes {}", e);
		}

		return client;

	}

	@RequestMapping(value = "get/client/{id}", method = RequestMethod.GET, produces = "application/json")
	public Client getClientById(@PathVariable("id") long id) {
		Client client = null;
		try {
			client = clientService.getClientById(id);
			if (client != null) {
				log.info("Cliente encontrado {}", id);
			}

		} catch (Exception e) {
			log.error("Problemas {}", e);
		}

		return client;

	}

	@RequestMapping(value = "get/mechanic", method = RequestMethod.GET, produces = "application/json")
	public ResponseMechanic getClientByType() {
		ResponseMechanic response = new ResponseMechanic();
		try {

			String isMechanic = GoConstant.IS_MECHANIC;
			response.setCode("0");
			response.setMessage("Exito");
			response.setUid(1221212L);
			response.setMechanic(clientService.getClientByType(isMechanic));

		} catch (Exception e) {
			log.error("Problemas {}", e);
		}

		return response;

	}

	@RequestMapping(value = "create/client", method = RequestMethod.POST, produces = "application/json")
	public Client createClient(@RequestBody Client client) {
		Client cli = null;
		try {
			cli = clientService.registerClient(client);
			if (cli == null) {
				log.info("No se pudo crear el cliente");
			}

		} catch (Exception e) {
			log.error("Problemas al consumir service registerClient", e);
		}

		return cli;
	}
}
