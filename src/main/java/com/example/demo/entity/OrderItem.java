package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import static javax.persistence.FetchType.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {

	@Id @GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;
	
//	@Column(name = "ORDER_ID")
//	private Long orderId;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "ITEM_ID")
	private Item item;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@Column(name = "MEMBER_ID")
	private Long memberId;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
}
