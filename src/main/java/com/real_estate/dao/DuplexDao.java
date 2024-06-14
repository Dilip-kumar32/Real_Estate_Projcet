package com.real_estate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.real_estate.models.Duplex;
import com.real_estate.models.Flats;

@Repository
public class DuplexDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	//get single Duplex Details
	public Duplex getSingleDuplex(int id) {
		Duplex duplex=this.hibernateTemplate.get(Duplex.class,id);
		return duplex;
	}
	
	//get All Duplex Details
	public List<Duplex> getAllDuplex() {
		List<Duplex> list=this.hibernateTemplate.loadAll(Duplex.class);
		return list;
	}
	
	//insert Duplex Details
	@Transactional
	public int saveDuplexDetails(Duplex duplex) {
		Integer i=(Integer)this.hibernateTemplate.save(duplex);
		return i;
	}
	
	//update Duplex Details
	@Transactional
	public void updateDuplexDetails(Duplex duplex) {
		this.hibernateTemplate.update(duplex);
	}
	
	//Delete Duplex Details
	@Transactional
	public void deleteDuplexDetails(int id) {
		Duplex duplex=this.hibernateTemplate.get(Duplex.class,id);
		this.hibernateTemplate.delete(duplex);
	}
	
}
