package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.api.go.repair.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
