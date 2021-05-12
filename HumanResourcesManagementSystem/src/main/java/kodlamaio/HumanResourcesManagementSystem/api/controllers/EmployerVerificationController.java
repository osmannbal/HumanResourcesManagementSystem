package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerVerificationService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerVerification;

@RestController
@RequestMapping("/api/employerverifications")
public class EmployerVerificationController {
	private EmployerVerificationService employerVerificationService;

	public EmployerVerificationController(EmployerVerificationService employerVerificationService) {
		super();
		this.employerVerificationService = employerVerificationService;
	}
	
	@GetMapping("getall")
	public List<EmployerVerification> getAll(){
		return this.employerVerificationService.getAll();
	}
	
	@GetMapping("getid")
	public EmployerVerification get(int id){
		return this.employerVerificationService.get(id);
	}
	
	@GetMapping("add")
	public void add(EmployerVerification employerVerification) {
		this.employerVerificationService.add(employerVerification);
	}
	
	@GetMapping("update")
	public void update(EmployerVerification employerVerification) {
		this.employerVerificationService.update(employerVerification);
	}
	
	@GetMapping("delete")
	public void delete(EmployerVerification employerVerification) {
		this.employerVerificationService.delete(employerVerification);
	}
	
}

