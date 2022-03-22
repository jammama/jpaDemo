package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Item;
import com.example.demo.entity.Member;
import com.example.demo.service.ItemService;
import com.example.demo.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService memberService;
	@Autowired
	ItemService itemService;
	
	@GetMapping(value = "/test")
	public String testJpa() {
		
		//Member member = memberService.selectMember();
		Member member = memberService.saveMember();
		String name = member.getName();
		return name;
	}
	
	@GetMapping(value = "/test2")
	public String testJpa2() {
		Book book = new Book();
		//Member member = memberService.selectMember();
		Item item = itemService.saveBook(book);
		return item.getName();
	}
	@GetMapping(value = "/saveMember")
	public String saveMember() {;
		Member member = memberService.saveMember();
		return member.getName(); 
	}
	@GetMapping(value = "/test3")
	public String testJpa3() {;
		return memberService.groupingMember();
	}
}
