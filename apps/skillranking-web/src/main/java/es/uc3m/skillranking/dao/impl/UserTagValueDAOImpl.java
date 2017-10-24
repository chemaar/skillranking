package es.uc3m.skillranking.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.uc3m.skillranking.dao.UserDAO;
import es.uc3m.skillranking.dao.UserTagValueDAO;
import es.uc3m.skillranking.model.Tag;
import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

@Component
public class UserTagValueDAOImpl implements UserTagValueDAO{
	
	List<UserTagValue> userTagValue;

	public UserTagValueDAOImpl() {
		super();
		this.userTagValue =  Constants.createUsersTagValue();
	}

	public boolean create(UserTagValue userTagValue) {
		return this.userTagValue.add(userTagValue);
	}

	public UserTagValue retrieve(UserTagValue userTagValue) {
		return userTagValue;
	}

	public boolean update(UserTagValue userTagValue) {
		return true;
	}

	public boolean delete(UserTagValue userTagValue) {
		return true;
	}

	public List<UserTagValue> list() {
		return this.userTagValue;
	}
	

	
}
