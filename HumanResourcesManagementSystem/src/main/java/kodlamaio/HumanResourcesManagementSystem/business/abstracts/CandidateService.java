package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll();
	Candidate get(int id);
	void add(Candidate candidate);
	void update(Candidate candidate);
	void delete(Candidate candidate);
}
