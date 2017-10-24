package es.uc3m.skillranking.dao.impl;

import java.util.LinkedList;
import java.util.List;

import es.uc3m.skillranking.model.Document;
import es.uc3m.skillranking.model.DocumentTagValue;
import es.uc3m.skillranking.model.Tag;
import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

public class Constants {
	
	
	private static Tag tag = new Tag("1","bigdata");
	private static List<Tag> tags = createTags();
	private static Document doc = new Document("http://twitter.com/789654123", "Twitter",tags);
	private static User user = new User("example@mail.com");

	public static List<Tag> createTags(){
		List<Tag> tags = new LinkedList<Tag>();
		tags.add(tag);
		return tags;
	}
	
	
	public static List<Document> createDocuments(){
		List<Document> documents = new LinkedList<Document>();
		documents.add(doc);
		return documents;
	}
	
	public static List<DocumentTagValue> createDocumentsTagValue(){
		List<DocumentTagValue> documentTagValue = new LinkedList<DocumentTagValue>();
		documentTagValue.add(new DocumentTagValue(doc, tag, 1.5));
		return documentTagValue;
	}
	
	public static List<User> createUsers(){
		List<User> users = new LinkedList<User>();
		users.add(user);
		return users;
	}
	
	static List<UserTagValue> createUsersTagValue(){
		List<UserTagValue> userTagValue = new LinkedList<UserTagValue>();
		userTagValue.add(new UserTagValue(tag, user, 2.5));
		return userTagValue;
	}

	
	
}
