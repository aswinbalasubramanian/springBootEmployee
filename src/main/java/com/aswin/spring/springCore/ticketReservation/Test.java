package com.aswin.spring.springCore.ticketReservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aswin.spring.springCore.lc.annotations.Patient;

/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/ticketReservation/listconfig.xml");
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
		System.out.println(ticketReservation );
		context.registerShutdownHook();		
	}

}
