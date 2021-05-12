package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;


import kodlamaio.HumanResourcesManagementSystem.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	User get(int id);
	void add(User user);
	void update(User user);
	void delete(User user);
}
