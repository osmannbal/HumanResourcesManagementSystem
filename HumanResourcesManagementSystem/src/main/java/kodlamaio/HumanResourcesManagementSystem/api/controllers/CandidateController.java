package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController{
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("getall")
	public List<Candidate> getAll(){
		return this.candidateService.getAll();
	}
	
	@GetMapping("getid")
	public Candidate get(int id){
		return this.candidateService.get(id);
	}
	
	@GetMapping("add")
	public void add(Candidate candidate) {
		this.candidateService.add(candidate);
	}
	
	@GetMapping("update")
	public void update(Candidate candidate) {
		this.candidateService.update(candidate);
	}
	
	@GetMapping("delete")
	public void delete(Candidate candidate) {
		this.candidateService.delete(candidate);
	}
}
