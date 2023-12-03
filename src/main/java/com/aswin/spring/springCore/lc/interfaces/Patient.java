package com.aswin.spring.springCore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside set method");
	}

	public void hi() {
		System.out.println("Inside hi method");
	}

	public void bye() {
		System.out.println("Inside Bye method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method afterProperties set");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method ");
	}

}
