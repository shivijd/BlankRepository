package com.capgemini.demoPracticeSpringBoot.repository;

import java.util.List;

import com.capgemini.demoPracticeSpringBoot.dto.Shipwreck;

public interface ShipwreckRepository {

	public Shipwreck create(Shipwreck wreck);
	public List<Shipwreck> list();
	public Shipwreck get(Long id);
	public Shipwreck update( Shipwreck wreck);
	public Shipwreck delete(Long id);
}
