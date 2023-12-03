package com.aswin.spring.springCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		System.out.println("Name :"+carDealer.getName());
		System.out.println("Department :"+carDealer.getModels());
		System.out.println("What kind of set is created? :"+carDealer.getModels().getClass());
	}
}
