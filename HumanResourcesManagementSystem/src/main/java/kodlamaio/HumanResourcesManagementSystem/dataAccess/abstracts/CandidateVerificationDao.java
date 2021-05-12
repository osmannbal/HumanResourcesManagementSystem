package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CandidateVerification;

public interface CandidateVerificationDao extends JpaRepository<CandidateVerification, Integer>{

}
