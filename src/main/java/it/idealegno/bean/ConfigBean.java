package it.idealegno.bean;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class ConfigBean {
	
	@PersistenceContext EntityManager em;
	
	@PostConstruct
	public void initialize() {
		System.out.println("entitymanager is " + em);
	}

}
