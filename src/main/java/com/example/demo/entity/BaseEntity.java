package com.example.demo.entity;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

	private String createBy;
	private String createDate;
	private String modifyBy;
	private String modifyDate;
}