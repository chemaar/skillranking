package es.uc3m.skillranking.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class User {
	private String email;
	private String name;
	private String familyName;
	private List<Tag> interests;
	
	
	
	public User(String email) {
		super();
		this.email = email;
		this.interests = new LinkedList<Tag>();
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public List<Tag> getInterests() {
		return interests;
	}
	public void setInterests(List<Tag> interests) {
		this.interests = interests;
	}



	@Override
	public String toString() {
		return "Suscriber [email=" + email + ", name=" + name + ", familyName="
				+ familyName + ", interests=" + interests + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	};

	
}
