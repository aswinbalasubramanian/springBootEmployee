package com.aswin.spring.springCore.ticketReservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter of ticket");
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("Inside init method of Ticket");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside destroy method Ticket");
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
}
