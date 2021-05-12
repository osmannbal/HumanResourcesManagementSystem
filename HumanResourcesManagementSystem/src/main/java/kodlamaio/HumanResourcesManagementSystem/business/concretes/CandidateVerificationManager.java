package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateVerificationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CandidateVerificationDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CandidateVerification;

@Service
public class CandidateVerificationManager implements CandidateVerificationService{

	private CandidateVerificationDao candidateVerificationDao;
	
	
	public CandidateVerificationManager(CandidateVerificationDao candidateVerificationDao) {
		super();
		this.candidateVerificationDao = candidateVerificationDao;
	}

	@Override
	public List<CandidateVerification> getAll() {
		return this.candidateVerificationDao.findAll();
	}

	@Override
	public CandidateVerification get(int id) {
		return this.candidateVerificationDao.getOne(id);
	}

	@Override
	public void add(CandidateVerification candidateVerification) {
		this.candidateVerificationDao.save(candidateVerification);
		
	}

	@Override
	public void update(CandidateVerification candidateVerification) {
		this.candidateVerificationDao.saveAndFlush(candidateVerification);
		
	}

	@Override
	public void delete(CandidateVerification candidateVerification) {
		this.candidateVerificationDao.delete(candidateVerification);
		
	}

}
