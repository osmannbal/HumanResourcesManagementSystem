package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;


import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
	Employee get(int id);
	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
}
