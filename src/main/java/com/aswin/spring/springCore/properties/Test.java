package com.aswin.spring.springCore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/properties/propertiesconfig.xml");
		CountriesAndLanguages coutriesAndLangs = (CountriesAndLanguages) ctx.getBean("countryAndLangs");
		System.out.println(coutriesAndLangs);
		
	}

}
