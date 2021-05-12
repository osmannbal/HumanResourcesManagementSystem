package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerVerificationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerVerificationDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerVerification;

@Service
public class EmployerVerificationManager implements EmployerVerificationService{
	
	private EmployerVerificationDao employerVerificationDao;

	public EmployerVerificationManager(EmployerVerificationDao employerVerificationDao) {
		super();
		this.employerVerificationDao = employerVerificationDao;
	}

	@Override
	public List<EmployerVerification> getAll() {
		return this.employerVerificationDao.findAll();
	}

	@Override
	public EmployerVerification get(int id) {
		return this.employerVerificationDao.getOne(id);
	}

	@Override
	public void add(EmployerVerification employerVerification) {
		this.employerVerificationDao.save(employerVerification);
	}

	@Override
	public void update(EmployerVerification employerVerification) {
		this.employerVerificationDao.saveAndFlush(employerVerification);
		
	}

	@Override
	public void delete(EmployerVerification employerVerification) {
		this.employerVerificationDao.delete(employerVerification);
		
	}
}
