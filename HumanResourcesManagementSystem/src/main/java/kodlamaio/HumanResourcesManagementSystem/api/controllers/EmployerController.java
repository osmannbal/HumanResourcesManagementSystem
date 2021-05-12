package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	private EmployerService employerService;

	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("getall")
	public List<Employer> getAll(){
		return this.employerService.getAll();
	}
	
	@GetMapping("getid")
	public Employer get(int id){
		return this.employerService.get(id);
	}
	
	@GetMapping("add")
	public void add(Employer employer) {
		this.employerService.add(employer);
	}
	
	@GetMapping("update")
	public void update(Employer employer) {
		this.employerService.update(employer);
	}
	
	@GetMapping("delete")
	public void delete(Employer employer) {
		this.employerService.delete(employer);
	}
	
}
