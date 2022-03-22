package com.example.demo.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomMemberRepositoryImpl implements CustomMemberRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Member customFindMethod(Long id) {
		return (Member) entityManager.createQuery("FROM member u WHERE u.id = :id")
			.setParameter("id",id)
			.getSingleResult();
	}

}
