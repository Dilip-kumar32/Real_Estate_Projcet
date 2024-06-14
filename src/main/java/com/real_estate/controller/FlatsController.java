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


import com.real_estate.models.Flats;
import com.real_estate.service.FlatsService;

@Controller
public class FlatsController {

	@Autowired
	private FlatsService flatsService;
		
		@RequestMapping("/flats_form")
		public String getform() {
			return "flats_form";
		}
	
		//get contact 
		@RequestMapping("/contact1")
		public String getContact() {
			return "contact1";
		}
		
	// get All Flats Details
		@RequestMapping("/displayallFlats")
		public String getAllFlatsDetails(Model m) {
			List<Flats> list=this.flatsService.getAllFlatsValue();
			m.addAttribute("flats", list);
			return "displayallFlats";
		}
		
		//get single Flats values
		@RequestMapping("/flats/{id}")
		public String Flats(@PathVariable("id") int id,HttpSession session,Model m) {
			Flats flats =this.flatsService.getSingleFlatsValue(id);
			m.addAttribute("flats", flats);
			session.setAttribute("flatsId",flats.getId());
			return "flats";
		}
		
		
		//insert Flats details
		@RequestMapping(path="/SaveFlats",method=RequestMethod.POST)
		public String saveFlatsDetails(@RequestParam("photo") CommonsMultipartFile file,
				@RequestParam("description") String description,@RequestParam("location") String location,
				@RequestParam("price") int price,@RequestParam("about") String about,
				@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
			Flats flats=new Flats();
			flats.setDescription(description);
			flats.setLocation(location);
			flats.setPrice(price);
			flats.setAbout(about);
			flats.setPhoto1(file1.getOriginalFilename());
			flats.setPhoto(file.getOriginalFilename());
			
			
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
			
			this.flatsService.insertFlatsValue(flats);
			return "profilepage";
		}
		
		// get All Flats Details for update display
		@RequestMapping("/displayallflatsupdate")
		public String getAllflatsDetailsforupdate(Model m) {
			List<Flats> list=this.flatsService.getAllFlatsValue();
			m.addAttribute("flats", list);
			return "displayallflatsforupdate";
		}
		// help to get single Flats details for update		
	    @RequestMapping("/updateflats/{id}")
		public String getUpdateflats(@PathVariable("id") int id,Model m) {
	    	Flats flats =this.flatsService.getSingleFlatsValue(id);
			m.addAttribute("flats", flats);
			return "updateflats";
		}
		
		//update Flats details
		@RequestMapping(path="/Updateflats",method=RequestMethod.POST)
		public String updateFlatsDetails(@RequestParam("photo") CommonsMultipartFile file,
				@RequestParam("description") String description,@RequestParam("location") String location,
				@RequestParam("price") int price,@RequestParam("about") String about,@RequestParam("id") int  id,
				@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
			Flats flats=new Flats();
			flats.setId(id);
			flats.setDescription(description);
			flats.setLocation(location);
			flats.setPrice(price);
			flats.setAbout(about);
			flats.setPhoto1(file1.getOriginalFilename());
			flats.setPhoto(file.getOriginalFilename());
			
			
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
			
			this.flatsService.updateFlatsValue(flats);
			List<Flats> flats1=this.flatsService.getAllFlatsValue();
			m.addAttribute("flats", flats1);
			return "displayallflatsforupdate";
		}
		
		
		//get Flats details for delete
		@RequestMapping("/displayallflatsfordelete")
		public String getdflatsdetailfordelete(Model m) {
			List<Flats> list=this.flatsService.getAllFlatsValue();
			m.addAttribute("flats", list);
			return "displayallflatsfordelete";
		}
		
		//delete Flats details
		@RequestMapping("/deleteflats/{id}")
		public String deleteflats(@PathVariable("id") int id, Model m) {
			this.flatsService.deleteFlatsValue(id);
			List<Flats> list=this.flatsService.getAllFlatsValue();
			m.addAttribute("flats", list);
			return "displayallflatsfordelete";
		}

		
	
	
}
