package com.example.UploadBySang.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String id;
	
	private String name;
	
	private String logo;

	public Student(String id, String name, String logo) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
	}

	public Student() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
	
	
}
