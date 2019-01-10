package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.api.go.repair.model.Audit;

public interface IAuditRepository extends JpaRepository<Audit, Long> {

}
