package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDaoImpl;
import model.Login;
import model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDaoImpl userDao;

	public void register(User user) {
		userDao.register(user);
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
