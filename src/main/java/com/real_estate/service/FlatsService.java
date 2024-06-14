package com.real_estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.real_estate.dao.FlatsDao;
import com.real_estate.models.Flats;
import com.real_estate.models.Land;

@Service
public class FlatsService {
	@Autowired
	private FlatsDao flatsDao;
	
	//get single Flats value
	public Flats getSingleFlatsValue(int id) {
		Flats flats=this.flatsDao.getSingleFlats(id);
		return flats;
	}
	
	//get All Flats Value
	public List<Flats> getAllFlatsValue(){
		List<Flats> list=this.flatsDao.getAllFlats();
		return list;
	}
	
	//insert Flats Value
	public void insertFlatsValue(Flats flats) {
		Integer i=(Integer)this.flatsDao.saveFlatsDetails(flats);
	}
	
	//update Flats Value
	public void updateFlatsValue(Flats flats) {
		this.flatsDao.updateFlatsDetails(flats);;
	}
	
	//Delete Flats Value
	public void deleteFlatsValue(int id) {
		this.flatsDao.deleteFlatsDetails(id);
	}

	
}
