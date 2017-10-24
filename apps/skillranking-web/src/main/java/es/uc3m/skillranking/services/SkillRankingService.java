package es.uc3m.skillranking.services;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uc3m.skillranking.appserv.SkillRankingAppServ;
import es.uc3m.skillranking.model.Document;
import es.uc3m.skillranking.model.DocumentTagValue;
import es.uc3m.skillranking.model.User;
import es.uc3m.skillranking.model.UserTagValue;

@Scope("request")
@CrossOrigin
@RestController
@RequestMapping("services/skillranking/")
public class SkillRankingService {

	protected static Logger logger = Logger.getLogger(SkillRankingService.class);
	
	@Autowired
	SkillRankingAppServ  skillRankingAppServ;
	
	 public SkillRankingService() {
		this.skillRankingAppServ = new SkillRankingAppServ();
	}
	
	@RequestMapping(value = "user/list", 
			method = RequestMethod.GET, 
			produces = "application/json")
	public List<User> list() {
		try{	
			return this.skillRankingAppServ.listUsers();
		}catch(Exception e){
			logger.error("Requesting list of users",e);
		}
		return Collections.emptyList();
	}
	
	@RequestMapping(value = "expertise/user/list", 
			method = RequestMethod.GET, 
			produces = "application/json")
	public List<UserTagValue> listUserTagValue() {
		try{	
			return this.skillRankingAppServ.listUserValueTag();
		}catch(Exception e){
			logger.error("Requesting list of documents",e);
		}
		return Collections.emptyList();
	}
	
	@RequestMapping(value = "docs/list", 
			method = RequestMethod.GET, 
			produces = "application/json")
	public List<Document> listDocuments() {
		try{	
			return this.skillRankingAppServ.listDocuments();
		}catch(Exception e){
			logger.error("Requesting list of documents",e);
		}
		return Collections.emptyList();
	}
	
	@RequestMapping(value = "expertise/doc/list", 
			method = RequestMethod.GET, 
			produces = "application/json")
	public List<DocumentTagValue> listDocumentTagValue() {
		try{	
			return this.skillRankingAppServ.listDocumentValueTags();
		}catch(Exception e){
			logger.error("Requesting list of documents",e);
		}
		return Collections.emptyList();
	}
	
}
