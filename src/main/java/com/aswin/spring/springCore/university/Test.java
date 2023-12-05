package com.aswin.spring.springCore.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/university/config.xml");
		University university =  (University)context.getBean("university");
		University university2=  (University)context.getBean("university");
		
		System.out.println(university);
		System.out.println(university.hashCode());
		System.out.println(university2);
		System.out.println(university2.hashCode());
				
		
	}

}
