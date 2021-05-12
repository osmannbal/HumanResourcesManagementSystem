package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.UserService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	
	@GetMapping("getid")
	public User get(int id){
		return this.userService.get(id);
	}
	
	@GetMapping("add")
	public void add(User user) {
		this.userService.add(user);
	}
	
	@GetMapping("update")
	public void update(User user) {
		this.userService.update(user);
	}
	
	@GetMapping("delete")
	public void delete(User user) {
		this.userService.delete(user);
	}
	
}
