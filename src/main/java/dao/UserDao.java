package dao;

import model.User;
import model.Login;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
}
