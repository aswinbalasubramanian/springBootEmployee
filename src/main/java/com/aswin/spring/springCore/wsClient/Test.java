package com.aswin.spring.springCore.wsClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/wsClient/config.xml");
		ReadProperties readProperties = (ReadProperties) context.getBean("readProperties");
		System.out.println(readProperties );
	}
}
