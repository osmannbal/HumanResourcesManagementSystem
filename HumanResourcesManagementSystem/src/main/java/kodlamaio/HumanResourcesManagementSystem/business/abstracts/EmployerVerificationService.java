package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;


import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerVerification;

public interface EmployerVerificationService {
	List<EmployerVerification> getAll();
	EmployerVerification get(int id);
	void add(EmployerVerification employerVerification);
	void update(EmployerVerification employerVerification);
	void delete(EmployerVerification employerVerification);
}
