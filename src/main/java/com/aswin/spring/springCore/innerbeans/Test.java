package com.aswin.spring.springCore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/innerbeans/config.xml");
		Employee employee =  (Employee)context.getBean("employee");
		Employee employee2 =  (Employee)context.getBean("employee");
		
		System.out.println(employee);
		System.out.println(employee.hashCode());
		System.out.println(employee2);
		System.out.println(employee2.hashCode());
				
	}

}
