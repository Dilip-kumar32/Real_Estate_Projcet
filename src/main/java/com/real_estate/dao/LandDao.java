package com.real_estate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.real_estate.models.Land;
import com.real_estate.models.User;

@Repository
public class LandDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//get single Land Details
	public Land getSingleLand(int id) {
	Land land=this.hibernateTemplate.get(Land.class,id);
	return land;
	}
	
	//get All Lands Details
	public List<Land> getAllLand() {
		List<Land> list=this.hibernateTemplate.loadAll(Land.class);
		return list;
	}
	
	//insert Land Details
	@Transactional
	public int saveLandDetails(Land land) {
		Integer i=(Integer)this.hibernateTemplate.save(land);
		return i;
	}
	
	//update Land Details
	@Transactional
	public void updateLandDetails(Land land) {
		this.hibernateTemplate.update(land);
	}
	
	//Delete Land Details
	@Transactional
	public void deleteLandDetails(int id) {
		Land land=this.hibernateTemplate.get(Land.class,id);
		this.hibernateTemplate.delete(land);
	}
	
	
}
