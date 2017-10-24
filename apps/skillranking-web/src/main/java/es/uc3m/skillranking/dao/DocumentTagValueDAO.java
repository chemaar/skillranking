package es.uc3m.skillranking.dao;

import java.util.List;

import es.uc3m.skillranking.model.DocumentTagValue;


public interface DocumentTagValueDAO {
	public boolean create(DocumentTagValue documentTagValue);
	public DocumentTagValue retrieve(DocumentTagValue documentTagValue);
	public boolean update(DocumentTagValue documentTagValue);
	public boolean delete(DocumentTagValue documentTagValue);
	public List<DocumentTagValue> list();
}
