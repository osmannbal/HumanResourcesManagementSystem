package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployeeService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

	@Override
	public Employee get(int id) {
		return this.employeeDao.getOne(id);
	}

	@Override
	public void add(Employee employee) {
		this.employeeDao.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		this.employeeDao.saveAndFlush(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		this.employeeDao.delete(employee);
		
	}

}
