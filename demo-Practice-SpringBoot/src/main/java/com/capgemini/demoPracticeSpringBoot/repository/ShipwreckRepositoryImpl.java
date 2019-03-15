package com.capgemini.demoPracticeSpringBoot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.demoPracticeSpringBoot.dto.Shipwreck;

@Repository
@Transactional
public class ShipwreckRepositoryImpl implements ShipwreckRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@SuppressWarnings("finally")
	@Override
	public Shipwreck create(Shipwreck wreck) {
		System.out.println("In Create");
		try {
			System.out.println(wreck.getName());
					entityManager.persist(wreck);
						entityManager.close();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			entityManager.close();
			System.out.println("In Create 2");
			entityManager.flush();
			return wreck;
		}
		
	}

	@Override
	public List<Shipwreck> list() {
		System.out.println("In List inside");
		try {
			Query query = entityManager.createQuery(
			"select wreck from Shipwreck wreck");
	
			List<Shipwreck> ls=(List<Shipwreck>)query.getResultList();
			return ls;
		} finally {
		entityManager.close();
		System.out.println("In List inside 2");
		}
	}

	@Override
	public Shipwreck get(Long id) {
		System.out.println("Enter id to get the shipwreck");
		try{
			Shipwreck wreck=entityManager.find(Shipwreck.class,id);
			if(wreck==null)
				return null;
			wreck.setId(id);
				return wreck;
		}finally
		{
			entityManager.close();
		}

	}

	@Override
	public Shipwreck update(Shipwreck wreck) {
		System.out.println("Update shipwreck");
		try{
			entityManager.merge(wreck);
			return wreck;
		}finally {
			entityManager.close();
		}
	}

	@Override
	public Shipwreck delete(Long id) {
	System.out.println("Delete shipwreck by id");
	try {
		Shipwreck wreck=entityManager.find(Shipwreck.class,id);
		entityManager.remove(wreck);
		return wreck;
	}
		finally {
			entityManager.close();
		}
	}

}
