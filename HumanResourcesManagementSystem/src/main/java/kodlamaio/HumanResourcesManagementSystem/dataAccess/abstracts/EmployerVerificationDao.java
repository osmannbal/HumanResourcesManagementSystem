package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerVerification;

public interface EmployerVerificationDao extends JpaRepository<EmployerVerification, Integer>{

}
