package co.com.api.go.repair.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.api.go.repair.model.Client;
import co.com.api.go.repair.repository.ClientRepository;

@Service
public class ClientService {

	private static Logger log = LoggerFactory.getLogger(ClientService.class);

	@Autowired
	ClientRepository clientRepository;

	public List<Client> getAllClient() {
		List<Client> client = null;
		try {
			client = clientRepository.findAll();

		} catch (Exception e) {
			log.error("Problemas al consultar clientes {}", e);
		}
		return client;
	}

	public Client getClientById(long idClient) {
		Client client = null;
		try {
			client = clientRepository.findClientById(idClient);

		} catch (Exception e) {
			log.error("Problemas al consultar cliente {}", e);
		}
		return client;

	}

	public List<Client> getClientByType(String isMchanic) {
		List<Client> client = null;

		try {
			client = clientRepository.findClientByType(isMchanic);

		} catch (Exception e) {
			log.error("Problemas al consultar mecanico {}", e);
		}
		return client;

	}

	/**
	 * Metdo para registrar clientes
	 * 
	 * @param client
	 * @return
	 */
	public Client registerClient(Client client) {
		Client cli = new Client();
		try {
			cli.setName(client.getName());
			cli.setLastName(client.getLastName());
			cli.setPhonenumber(client.getPhonenumber());
			cli.setIdUser(client.getIdUser());
			cli.setIdentification(client.getIdentification());
			cli.setQualification(client.getQualification());
			cli.setIsMechanic(client.getIsMechanic());
			cli.setIdSuscription(client.getIdSuscription());
			clientRepository.save(cli);

		} catch (Exception e) {
			log.error("Error al momento de crear el cliente {}", e);
		}

		return cli;
	}

}
