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

import com.real_estate.models.Duplex;
import com.real_estate.service.DuplexService;

@Controller
public class DuplexConttoller {
	
	@Autowired
	private DuplexService duplexService;
		
		@RequestMapping("/duplex_form")
		public String getform() {
			return "duplex_form";
		}
	
		//get contact 
		@RequestMapping("/contact2")
		public String getContact() {
			return "contact2";
		}
		
	// get All Duplex Details
		@RequestMapping("/displayallDuplex")
		public String getAllDuplexDetails(Model m) {
			List<Duplex> list=this.duplexService.getAllDuplexValue();
			m.addAttribute("duplex", list);
			return "displayallDuplex";
		}
		
		//get single Duplex values
		@RequestMapping("/duplex/{id}")
		public String duplex(@PathVariable("id") int id,HttpSession session,Model m) {
			Duplex duplex =this.duplexService.getSingleDuplexValue(id);
			m.addAttribute("duplex", duplex);
			session.setAttribute("duplexId",duplex.getId());
			return "duplex";
		}
		
		
		//insert Duplex details
		@RequestMapping(path="/SaveDuplex",method=RequestMethod.POST)
		public String saveDuplexDetails(@RequestParam("photo") CommonsMultipartFile file,
				@RequestParam("description") String description,@RequestParam("location") String location,
				@RequestParam("price") int price,@RequestParam("about") String about,
				@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
			Duplex duplex=new Duplex();
			duplex.setDescription(description);
			duplex.setLocation(location);
			duplex.setPrice(price);
			duplex.setAbout(about);
			duplex.setPhoto1(file1.getOriginalFilename());
			duplex.setPhoto(file.getOriginalFilename());
			
			
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
			
			this.duplexService.insertDuplexValue(duplex);
			return "profilepage";
		}
		
		// get All Duplex Details for update display
				@RequestMapping("/displayallduplexupdate")
				public String getAllDuplexDetailsforupdate(Model m) {
					List<Duplex> list=this.duplexService.getAllDuplexValue();
					m.addAttribute("duplex", list);
					return "displayallduplexforupdate";
				}
		// help to get single duplex details for update		
			    @RequestMapping("/updateduplex/{id}")
				public String getUpdateDuplex(@PathVariable("id") int id,Model m) {
					Duplex duplex =this.duplexService.getSingleDuplexValue(id);
					m.addAttribute("duplex", duplex);
					return "updateduplex";
				}
				
				//update Duplex details
				@RequestMapping(path="/UpdateDuplex",method=RequestMethod.POST)
				public String updateDuplexDetails(@RequestParam("photo") CommonsMultipartFile file,
						@RequestParam("description") String description,@RequestParam("location") String location,
						@RequestParam("price") int price,@RequestParam("about") String about,@RequestParam("id") int  id,
						@RequestParam("photo1") CommonsMultipartFile file1, HttpSession s,Model m) {
					Duplex duplex=new Duplex();
					duplex.setId(id);
					duplex.setDescription(description);
					duplex.setLocation(location);
					duplex.setPrice(price);
					duplex.setAbout(about);
					duplex.setPhoto1(file1.getOriginalFilename());
					duplex.setPhoto(file.getOriginalFilename());
					
					
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
					
					this.duplexService.updateDuplexValue(duplex);
					List<Duplex> duplex1=this.duplexService.getAllDuplexValue();
					m.addAttribute("duplex", duplex1);
					return "displayallduplexforupdate";
				}
				
				
				//get duplex details for delete
				@RequestMapping("/displayallduplexfordelete")
				public String getduplexdetailfordelete(Model m) {
					List<Duplex> list=this.duplexService.getAllDuplexValue();
					m.addAttribute("duplex", list);
					return "displayallduplexfordelete";
				}
				
				//delete duplex details
				@RequestMapping("/deleteduplex/{id}")
				public String deleteduplex(@PathVariable("id") int id, Model m) {
					this.duplexService.deleteDuplexValue(id);
					List<Duplex> list=this.duplexService.getAllDuplexValue();
					m.addAttribute("duplex", list);
					return "displayallduplexfordelete";
				}
	
	
}
