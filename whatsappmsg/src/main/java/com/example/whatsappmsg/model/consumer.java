package com.example.whatsappmsg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String whatapp_num;

	consumer() {

	}
	consumer(String name, String email, String whatapp_num) {
		this.name = name;
		this.email = email;
		this.whatapp_num = whatapp_num;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWhatapp_num() {
		return whatapp_num;
	}

	public void setWhatapp_num(String whatapp_num) {
		this.whatapp_num = whatapp_num;
	}

}
