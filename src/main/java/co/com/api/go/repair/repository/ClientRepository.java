package co.com.api.go.repair.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.api.go.repair.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	@Query("SELECT c FROM Client c WHERE c.id =?1")
	public Client findClientById(long idClient);
	
	@Query("SELECT c FROM Client c WHERE c.isMechanic =?1")
	public List<Client> findClientByType(String isMechanic);

}
