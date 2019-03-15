package com.capgemini.demoPracticeSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demoPracticeSpringBoot.dto.Shipwreck;
import com.capgemini.demoPracticeSpringBoot.dto.ShipwreckStub;
import com.capgemini.demoPracticeSpringBoot.repository.ShipwreckRepositoryImpl;

@RestController
@RequestMapping("api/v1")
public class ShipwreckController {
	
	@Autowired
	ShipwreckRepositoryImpl shipwreckRef;
	
	@RequestMapping(method=RequestMethod.GET,value="shipwreks")
	public List<Shipwreck> list(){
//		return ShipwreckStub.list();
		System.out.println("In List");
		return shipwreckRef.list();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="shipwreks")
	public Shipwreck save(@RequestBody Shipwreck shipwreck)
	{
//		return ShipwreckStub.create(shipwreck);
		System.out.println(shipwreck.getCondition()+"\n"+shipwreck.getName());
		System.out.println("In Save");
		return shipwreckRef.create(shipwreck);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="shipwreks/{id}")
	public Shipwreck get(@PathVariable(value="id") long id) {
//		return ShipwreckStub.get(id);
		return shipwreckRef.get(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="shipwreks/{id}")
	public Shipwreck update(@RequestBody Shipwreck shipwreck) {
//		return ShipwreckStub.update(id, shipwreck);
		return shipwreckRef.update( shipwreck);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="shipwreks/{id}")
	public Shipwreck delete(@PathVariable(value="id") long id) {
//		return ShipwreckStub.delete(id);
		return shipwreckRef.delete(id);
	}

}
