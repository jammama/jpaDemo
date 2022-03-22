package com.example.demo.entity;

import java.time.LocalDateTime;

public class Period {
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public void setNowDate() {
		this.startDate = LocalDateTime.now();
		this.endDate = LocalDateTime.now();
	}
	
	public Period() {
		this.startDate = LocalDateTime.parse("2022-04-08T12:30:00");
		this.startDate = LocalDateTime.parse("2022-04-08T12:30:00");
	}
}
