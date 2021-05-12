package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployeeService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.User;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("getall")
	public List<Employee> getAll(){
		return this.employeeService.getAll();
	}
	
	@GetMapping("getid")
	public Employee get(int id){
		return this.employeeService.get(id);
	}
	
	@GetMapping("add")
	public void add(Employee employee) {
		this.employeeService.add(employee);
	}
	
	@GetMapping("update")
	public void update(Employee employee) {
		this.employeeService.update(employee);
	}
	
	@GetMapping("delete")
	public void delete(Employee employee) {
		this.employeeService.delete(employee);
	}
	
}
