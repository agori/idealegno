package it.idealegno.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Config implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String name;
	
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}