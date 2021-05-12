package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateVerificationService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CandidateVerification;

@RestController
@RequestMapping("/api/candidateverifications")
public class CandidateVerificationController {
	private CandidateVerificationService candidateVerificationService;
	
	@Autowired
	public CandidateVerificationController(CandidateVerificationService candidateVerificationService) {
		super();
		this.candidateVerificationService = candidateVerificationService;
	}
	
	@GetMapping("getall")
	public List<CandidateVerification> getAll(){
		return this.candidateVerificationService.getAll();
	}
	
	@GetMapping("getid")
	public CandidateVerification get(int id){
		return this.candidateVerificationService.get(id);
	}
	
	@GetMapping("add")
	public void add(CandidateVerification candidateVerification) {
		this.candidateVerificationService.add(candidateVerification);
	}
	
	@GetMapping("update")
	public void update(CandidateVerification candidateVerification) {
		this.candidateVerificationService.update(candidateVerification);
	}
	
	@GetMapping("delete")
	public void delete(CandidateVerification candidateVerification) {
		this.candidateVerificationService.delete(candidateVerification);
	}
}
