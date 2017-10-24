package es.uc3m.skillranking.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.uc3m.skillranking.dao.DocumentDAO;
import es.uc3m.skillranking.model.Document;
import es.uc3m.skillranking.model.Tag;

@Component
public class DocumentDAOImpl implements DocumentDAO{
	
	List<Document> documents;

	public DocumentDAOImpl() {
		super();
		this.documents =  Constants.createDocuments();
	}

	public boolean create(Document document) {
		return this.documents.add(document);
	}

	public Document retrieve(Document document) {
		return document;
	}

	public boolean update(Document document) {
		return true;
	}

	public boolean delete(Document document) {
		return true;
	}

	public List<Document> list() {
		return this.documents;
	}
	
	

	
}
