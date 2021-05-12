package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CandidateDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	private CandidateDao candidateDao;
	
	
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();
	}

	@Override
	public Candidate get(int id) {
		return this.candidateDao.getOne(id);
	}

	@Override
	public void add(Candidate candidate) {
		this.candidateDao.save(candidate);
		
	}

	@Override
	public void update(Candidate candidate) {
		this.candidateDao.saveAndFlush(candidate);
		
	}

	@Override
	public void delete(Candidate candidate) {
		this.candidateDao.delete(candidate);
		
	}
	
}
