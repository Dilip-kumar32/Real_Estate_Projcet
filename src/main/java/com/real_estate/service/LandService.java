package com.real_estate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.real_estate.dao.LandDao;
import com.real_estate.models.Land;

@Service
public class LandService {
	
	@Autowired
	private LandDao landDao;
	
	//get single Land value
	public Land getSingleLandValue(int id) {
		Land land=this.landDao.getSingleLand(id);
		return land;
	}
	
	//get All Lands Value
	public List<Land> getAllLandValue(){
		List<Land> list=this.landDao.getAllLand();
		return list;
	}
	
	//insert Land Value
	public void insertLandValue(Land land) {
		Integer i=(Integer)this.landDao.saveLandDetails(land);
	}
	
	//update Land Value
	public void updateLandValue(Land land) {
		this.landDao.updateLandDetails(land);
	}
	
	//Delete Land Value
	public void deleteLandValue(int id) {
		this.landDao.deleteLandDetails(id);
	}
	
	
}
