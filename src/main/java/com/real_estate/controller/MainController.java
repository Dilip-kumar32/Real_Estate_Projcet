package com.real_estate.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.real_estate.models.Duplex;
import com.real_estate.models.Flats;
import com.real_estate.models.Land;
import com.real_estate.service.DuplexService;
import com.real_estate.service.FlatsService;
import com.real_estate.service.LandService;

@Controller
public class MainController {
	
	
		
	@Autowired
	private LandService landService;
	
	@Autowired
	private FlatsService flatsService;
	
	@Autowired
	private DuplexService duplexService;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/real_estate")
	public String real_estate() {
		return "real_estate";
	}
		
	@RequestMapping("/flats")
	public String flats() {
		return "flats";
	}
	
	@RequestMapping("/duplex")
	public String duplex() {
		return "duplex";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@RequestMapping("/registerpage") 
	public String registerpage() {
		return "registerpage";
	}
	
	@RequestMapping(path="/searchbar")
	public String search(@RequestParam("data") String data,Model m) {
	    if(data.equals("land")||data.equals("Land")) {
	    	List<Land> list=this.landService.getAllLandValue();
	    	m.addAttribute("land", list);
	    	return "displayallLand";
	    	}
	    if(data.equals("flats")||data.equals("Flats")) {
	    	List<Flats> list1=this.flatsService.getAllFlatsValue();
	    	m.addAttribute("flats", list1);
	    	return "displayallFlats";
	    }
	    if(data.equals("duplex")||data.equals("Duplex")) {
	    	List<Duplex> list2=this.duplexService.getAllDuplexValue();
	    	m.addAttribute("duplex", list2);
	    	return "displayallDuplex";
	    }
	    	
	    else
	    	return "nullpage";
	}

}
