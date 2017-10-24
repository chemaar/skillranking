package es.uc3m.skillranking.appserv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.uc3m.skillranking.dao.DocumentDAO;
import es.uc3m.skillranking.dao.DocumentTagValueDAO;
import es.uc3m.skillranking.dao.UserDAO;
import es.uc3m.skillranking.dao.UserTagValueDAO;
import es.uc3m.skillranking.model.Document;
import es.uc3m.skillranking.model.DocumentTagValue;
import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

@Component
public class SkillRankingAppServ {

	@Autowired
	DocumentDAO docDao;
	@Autowired
	UserDAO userDAO;
	@Autowired
	DocumentTagValueDAO docTagDao;
	@Autowired
	UserTagValueDAO userTagDao;

	
	
	public SkillRankingAppServ() {
		super();
	}

	public boolean create(Document document) {
		return this.docDao.create(document);
	}

	public Document retrieve(Document document) {
		return this.docDao.retrieve(document);
	}

	public boolean update(Document document) {
		return this.docDao.update(document);
	}

	public boolean delete(Document document) {
		return this.docDao.delete(document);
	}

	public List<Document> listDocuments() {
		return this.docDao.list();
	}
	
	
	public boolean create(User user) {
		return this.userDAO.create(user);
	}

	public User retrieve(User user) {
		return this.userDAO.retrieve(user);
	}

	public boolean update(User user) {
		return this.userDAO.update(user);
	}

	public boolean delete(User user) {
		return this.userDAO.delete(user);
	}

	public List<User> listUsers() {
		return this.userDAO.list();
	}
	
	
	public boolean create(DocumentTagValue documentTagValue) {
		return this.docTagDao.create(documentTagValue);
	}

	public DocumentTagValue retrieve(DocumentTagValue documentTagValue) {
		return this.docTagDao.retrieve(documentTagValue);
	}

	public boolean update(DocumentTagValue documentTagValue) {
		return this.docTagDao.update(documentTagValue);
	}

	public boolean delete(DocumentTagValue documentTagValue) {
		return this.docTagDao.delete(documentTagValue);
	}

	public List<DocumentTagValue> listDocumentValueTags() {
		return this.docTagDao.list();
	}
	
	
	public boolean create(UserTagValue userTagValue) {
		return this.userTagDao.create(userTagValue);
	}

	public UserTagValue retrieve(UserTagValue userTagValue) {
		return this.userTagDao.retrieve(userTagValue);
	}

	public boolean update(UserTagValue userTagValue) {
		return this.userTagDao.update(userTagValue);
	}

	public boolean delete(UserTagValue userTagValue) {
		return this.userTagDao.delete(userTagValue);
	}

	public List<UserTagValue> listUserValueTag() {
		return this.userTagDao.list();
	}
	
	
}
