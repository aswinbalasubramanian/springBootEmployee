package com.aswin.spring.springCore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside set method");
	}
	
	public void hi()
	{
		System.out.println("Inside hi method");
	}
	
	public void bye()
	{
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
