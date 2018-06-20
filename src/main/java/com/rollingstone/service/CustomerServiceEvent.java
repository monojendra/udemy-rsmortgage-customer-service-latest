package com.rollingstone.service;

import org.springframework.context.ApplicationEvent;

import com.rollingstone.domain.Customer;

/**
 * This is an optional class used in publishing application events.
 * This can be used to inject events into the Spring Boot audit management endpoint.
 */
public class CustomerServiceEvent extends ApplicationEvent {

	Customer eventCustomer;
	String eventType;
	
    public Customer getEventCustomer() {
		return eventCustomer;
	}

	public void setEventCustomer(Customer eventCustomer) {
		this.eventCustomer = eventCustomer;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public CustomerServiceEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My CustomerService Event";
    }
}