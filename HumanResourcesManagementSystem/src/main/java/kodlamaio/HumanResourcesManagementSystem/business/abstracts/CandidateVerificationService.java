package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;


import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CandidateVerification;

public interface CandidateVerificationService {
	List<CandidateVerification> getAll();
	CandidateVerification get(int id);
	void add(CandidateVerification candidateVerification);
	void update(CandidateVerification candidateVerification);
	void delete(CandidateVerification candidateVerification);
}
