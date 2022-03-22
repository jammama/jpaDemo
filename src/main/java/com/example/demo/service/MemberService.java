package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Item;
import com.example.demo.entity.Member;
import com.example.demo.entity.MemberRepository;
import com.example.demo.entity.RoleType;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	public Member selectMember() {
		Member member = memberRepository.findById(1L).get();
		return member;
	}
	
	public Member saveMember() {
		Member member = new Member();
		member.setId(1L);
		member.setName("AAAAA");
		member.setRoleType(RoleType.GUEST);
		memberRepository.save(member);

		return member;
	}
	
	public String groupingMember() {
		return memberRepository.groupingName();
	}
	
}
