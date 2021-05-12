package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.UserService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.UserDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

	@Override
	public User get(int id) {
		return this.userDao.getOne(id);
	}

	@Override
	public void add(User user) {
		this.userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.saveAndFlush(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}
	
	
}
