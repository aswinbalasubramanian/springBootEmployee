package com.aswin.spring.springCore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside set method");
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
