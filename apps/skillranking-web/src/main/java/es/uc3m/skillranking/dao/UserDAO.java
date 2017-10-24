package es.uc3m.skillranking.dao;

import java.util.List;

import es.uc3m.skillranking.model.User;

public interface UserDAO {
	public boolean create(User user);
	public User retrieve(User user);
	public boolean update(User user);
	public boolean delete(User user);
	public List<User> list();
}
