package es.uc3m.skillranking.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.uc3m.skillranking.dao.UserDAO;
import es.uc3m.skillranking.model.User;

@Component
public class UserDAOImpl implements UserDAO{
	
	List<User> users;

	public UserDAOImpl() {
		super();
		this.users =  Constants.createUsers();
	}

	public boolean create(User user) {
		return this.users.add(user);
	}

	public User retrieve(User user) {
		return user;
	}

	public boolean update(User user) {
		return true;
	}

	public boolean delete(User user) {
		return true;
	}

	public List<User> list() {
		return this.users;
	}
	


	
}
