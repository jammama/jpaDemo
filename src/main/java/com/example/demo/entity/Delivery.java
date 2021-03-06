package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delivery {
	
	@Id @GeneratedValue
	private Long id;
	
	private Address address;
	private DeliveryStatus status;
}
