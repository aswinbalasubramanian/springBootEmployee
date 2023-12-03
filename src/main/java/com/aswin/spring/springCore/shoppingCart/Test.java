package com.aswin.spring.springCore.shoppingCart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/shoppingCart/shoppingCartconfig.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(shoppingcart);
	}
}
