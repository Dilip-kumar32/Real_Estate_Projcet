package com.real_estate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.real_estate.models.Flats;
import com.real_estate.models.Land;

@Repository
public class FlatsDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//get single Flats Details
	public Flats getSingleFlats(int id) {
	Flats flats=this.hibernateTemplate.get(Flats.class,id);
	return flats;
	}
	
	//get All Flats Details
	public List<Flats> getAllFlats() {
		List<Flats> list=this.hibernateTemplate.loadAll(Flats.class);
		return list;
	}
	
	//insert Flats Details
	@Transactional
	public int saveFlatsDetails(Flats flat) {
		Integer i=(Integer)this.hibernateTemplate.save(flat);
		return i;
	}
	
	//update Flats Details
	@Transactional
	public void updateFlatsDetails(Flats flats) {
		this.hibernateTemplate.update(flats);
	}
	
	//Delete Flats Details
	@Transactional
	public void deleteFlatsDetails(int id) {
		Flats flats=this.hibernateTemplate.get(Flats.class,id);
		this.hibernateTemplate.delete(flats);
	}
	
	

}
