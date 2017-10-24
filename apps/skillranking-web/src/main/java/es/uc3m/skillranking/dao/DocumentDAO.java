package es.uc3m.skillranking.dao;

import java.util.List;

import es.uc3m.skillranking.model.Document;

public interface DocumentDAO {
	
	public boolean create(Document document);
	public Document retrieve(Document document);
	public boolean update(Document document);
	public boolean delete(Document document);
	public List<Document> list();

}
