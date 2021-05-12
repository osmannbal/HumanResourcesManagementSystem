package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobPositionService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	private JobPositionService jobPositionService;

	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
	@GetMapping("getid")
	public JobPosition get(int id){
		return this.jobPositionService.get(id);
	}
	
	@GetMapping("add")
	public void add(JobPosition jobPosition) {
		this.jobPositionService.add(jobPosition);
	}
	
	@GetMapping("update")
	public void update(JobPosition jobPosition) {
		this.jobPositionService.update(jobPosition);
	}
	
	@GetMapping("delete")
	public void delete(JobPosition jobPosition) {
		this.jobPositionService.delete(jobPosition);
	}
	
}
