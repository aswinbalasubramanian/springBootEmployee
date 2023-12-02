package com.aswin.spring.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id : "+ emp.getId());
		System.out.println("Employee Name : "+ emp.getName());
	}

}
