package es.uc3m.skillranking.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.uc3m.skillranking.dao.DocumentTagValueDAO;
import es.uc3m.skillranking.dao.UserDAO;
import es.uc3m.skillranking.dao.UserTagValueDAO;
import es.uc3m.skillranking.model.Document;
import es.uc3m.skillranking.model.DocumentTagValue;
import es.uc3m.skillranking.model.Tag;
import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

@Component
public class DocumentTagValueDAOImpl implements DocumentTagValueDAO{
	
	List<DocumentTagValue> documentTagValue;

	public DocumentTagValueDAOImpl() {
		super();
		this.documentTagValue =  Constants.createDocumentsTagValue();
	}

	public boolean create(DocumentTagValue userTagValue) {
		return this.documentTagValue.add(userTagValue);
	}

	public DocumentTagValue retrieve(DocumentTagValue userTagValue) {
		return userTagValue;
	}

	public boolean update(DocumentTagValue userTagValue) {
		return true;
	}

	public boolean delete(DocumentTagValue userTagValue) {
		return true;
	}

	public List<DocumentTagValue> list() {
		return this.documentTagValue;
	}
	


	
}
