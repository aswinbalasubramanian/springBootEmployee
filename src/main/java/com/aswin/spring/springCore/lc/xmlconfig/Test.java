package com.aswin.spring.springCore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Name :"+hospital.getName());
		System.out.println("Department :"+hospital.getDepartments());
		System.out.println("What kind of list is created? :"+hospital.getDepartments().getClass());
	}
}
