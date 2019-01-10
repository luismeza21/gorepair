package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.api.go.repair.model.Services;

public interface IServiceRepository extends JpaRepository<Services, Long> {

}
