package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;


import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}


	@Override
	public Employer get(int id) {
		return this.employerDao.getOne(id);
	}


	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
		
	}


	@Override
	public void update(Employer employer) {
		this.employerDao.saveAndFlush(employer);
		
	}


	@Override
	public void delete(Employer employer) {
		this.employerDao.delete(employer);
		
	}

	

}
