package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Item;
import com.example.demo.entity.ItemRepository;
import com.example.demo.entity.Member;
import com.example.demo.entity.MemberRepository;
import com.example.demo.entity.RoleType;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public Item saveBook(Book book) {
		
		book.setId(1L);
		book.setName("디제이");
		book.setAuthor("김밥");
		book.setIsbn("98000123545");
		itemRepository.save(book);
		
		return book;
	}
	
}
