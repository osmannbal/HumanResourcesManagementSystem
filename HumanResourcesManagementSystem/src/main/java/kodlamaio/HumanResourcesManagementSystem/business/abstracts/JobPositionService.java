package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
	JobPosition get(int id);
	void add(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	void delete(JobPosition jobPosition);
}
