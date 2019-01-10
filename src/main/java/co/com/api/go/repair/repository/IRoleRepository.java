package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.api.go.repair.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
