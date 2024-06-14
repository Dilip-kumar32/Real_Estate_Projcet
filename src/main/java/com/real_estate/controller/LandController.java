package com.real_estate.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import com.real_estate.models.Land;
import com.real_estate.service.LandService;

@Controller
public class LandController {
	
	@Autowired
	private LandService landService;
	
	
	// get All Land Details
	@RequestMapping("/displayallLand")
	public String getAllLandDetails(Model m) {
		List<Land> list=this.landService.getAllLandValue();
		m.addAttribute("land", list);
		return "displayallLand";
	}
	
	//get single land values
	@RequestMapping("/land/{id}")
	public String land(@PathVariable("id") int id,HttpSession session,Model m) {
		Land land =this.landService.getSingleLandValue(id);
		m.addAttribute("land", land);
		session.setAttribute("landId",land.getId());
		return "land";
	}
	
	
	//insert land details
	@RequestMapping(path="/SaveLand",method=RequestMethod.POST)
	public String saveLandDetails(@RequestParam("photo") CommonsMultipartFile file,
			@RequestParam("description") String description,@RequestParam("location") String location,
			@RequestParam("price") int price,@RequestParam("about") String about,
			@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
		Land land=new Land();
		land.setDescription(description);
		land.setLocation(location);
		land.setPrice(price);
		land.setAbout(about);
		land.setPhoto1(file1.getOriginalFilename());
		land.setPhoto(file.getOriginalFilename());
		
		
		//file store into server
		byte[] data=file.getBytes();
		byte[] data1=file1.getBytes();
		
		//setting path of image
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		String path1=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file1.getOriginalFilename();
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			FileOutputStream fos1=new FileOutputStream(path1);
			fos1.write(data1);
			fos.write(data);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		this.landService.insertLandValue(land);
		return "profilepage";
	}
	
	// get All Land Details for update display
	@RequestMapping("/displayalllandupdate")
	public String getAlllandDetailsforupdate(Model m) {
		List<Land> list=this.landService.getAllLandValue();
		m.addAttribute("land", list);
		return "displayalllandforupdate";
	}
   // help to get single land details for update		
    @RequestMapping("/updateland/{id}")
	public String getUpdateland(@PathVariable("id") int id,Model m) {
		Land land =this.landService.getSingleLandValue(id);
		m.addAttribute("land", land);
		return "updateLand";
	}
	
	//update land details
	@RequestMapping(path="/UpdateLand",method=RequestMethod.POST)
	public String updateLandDetails(@RequestParam("photo") CommonsMultipartFile file,
			@RequestParam("description") String description,@RequestParam("location") String location,
			@RequestParam("price") int price,@RequestParam("about") String about,@RequestParam("id") int id,
			@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
		Land land=new Land();
		land.setId(id);
		land.setDescription(description);
		land.setLocation(location);
		land.setPrice(price);
		land.setAbout(about);
		land.setPhoto1(file1.getOriginalFilename());
		land.setPhoto(file.getOriginalFilename());
		System.out.println(location);
		
		//file store into server
		byte[] data=file.getBytes();
		byte[] data1=file1.getBytes();
		
		//setting path of image
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		String path1=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file1.getOriginalFilename();
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			FileOutputStream fos1=new FileOutputStream(path1);
			fos1.write(data1);
			fos.write(data);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		this.landService.updateLandValue(land);
		List<Land> land1=this.landService.getAllLandValue();
		m.addAttribute("land", land1);
		return "displayalllandforupdate";
	}
	
	//get land details for delete
	@RequestMapping("/displayalllandfordelete")
	public String getlanddetailfordelete(Model m) {
		List<Land> list=this.landService.getAllLandValue();
		m.addAttribute("land", list);
		return "displayalllandfordelete";
	}
	
	//delete land details
	@RequestMapping("/deleteland/{id}")
	public String deleteland(@PathVariable("id") int id, Model m) {
		this.landService.deleteLandValue(id);
		List<Land> list=this.landService.getAllLandValue();
		m.addAttribute("land", list);
		return "displayalllandfordelete";
	}
	
	
}
