package co.com.api.go.repair.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.api.go.repair.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	

}
