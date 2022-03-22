package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import static javax.persistence.FetchType.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "PARENT_ID")
	private Category parent;
	
	@OneToMany
	private List<Category> child = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "CATEGRY_ITEM", 
			joinColumns = @JoinColumn(name = "CATEGORY_ID"),
			inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
	)
	private List<Item> items = new ArrayList<>();
}