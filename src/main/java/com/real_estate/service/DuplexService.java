package com.real_estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.real_estate.dao.DuplexDao;
import com.real_estate.models.Duplex;


@Service
public class DuplexService {

	@Autowired
	private DuplexDao duplexDao;
	
	//get single Duplex value
	public Duplex getSingleDuplexValue(int id) {
		Duplex duplex=this.duplexDao.getSingleDuplex(id);
		return duplex;
	}
	
	//get All Duplex Value
	public List<Duplex> getAllDuplexValue(){
		List<Duplex> list=this.duplexDao.getAllDuplex();
		return list;
	}
	
	//insert Duplex Value
	public void insertDuplexValue(Duplex duplex) {
		Integer i=(Integer)this.duplexDao.saveDuplexDetails(duplex);
	}
	
	//update Duplex Value
	public void updateDuplexValue(Duplex duplex) {
		this.duplexDao.updateDuplexDetails(duplex);
	}
	
	//Delete Duplex Value
	public void deleteDuplexValue(int id) {
		this.duplexDao.deleteDuplexDetails(id);
	}

	
}
