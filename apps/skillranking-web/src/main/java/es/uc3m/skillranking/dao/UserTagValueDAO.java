package es.uc3m.skillranking.dao;

import java.util.List;

import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

public interface UserTagValueDAO {
	public boolean create(UserTagValue userTagValue);
	public UserTagValue retrieve(UserTagValue userTagValue);
	public boolean update(UserTagValue userTagValue);
	public boolean delete(UserTagValue userTagValue);
	public List<UserTagValue> list();
}
