package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobPositionService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.JobPositionDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public JobPosition get(int id) {
		return this.jobPositionDao.getOne(id);
	}

	@Override
	public void add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		this.jobPositionDao.saveAndFlush(jobPosition);
		
	}

	@Override
	public void delete(JobPosition jobPosition) {
		this.jobPositionDao.delete(jobPosition);
		
	}
	
	
}
