package es.uc3m.skillranking.model;

import java.util.Collections;
import java.util.List;

public class Document {
	private String url;
	private String source;
	private List<Tag> tags = Collections.EMPTY_LIST;
	
	
	public Document(String url, String source, List<Tag> tags) {
		super();
		this.url = url;
		this.source = source;
		this.tags = tags;
	}
	
	
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Document other = (Document) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Document [url=" + url + ", source=" + source + ", tags=" + tags + "]";
	}

	
}
