package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.User;
import model.Login;

public class UserDaoImpl implements UserDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//	Session session = sessionFactory.openSession();
//	Transaction tx = null;

	public void register(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}

	public User validateUser(Login login) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from User where email='"+login.getEmail()+"' and password='"+login.getPassword()+"'");
		List<User> users = query.list();
		session.close();
		return users.get(0);
	}

}
