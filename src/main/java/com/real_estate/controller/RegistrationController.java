package com.real_estate.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.real_estate.models.User;
import com.real_estate.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/SaveServlet",method=RequestMethod.POST)
	public String register(@RequestParam("user_photo") CommonsMultipartFile file,
			@RequestParam("user_name") String name,@RequestParam("user_email") String email,
			@RequestParam("user_password") String password,@RequestParam("user_address") String address,
			@RequestParam("user_phone") String phone,@RequestParam("user_gender") String gender,HttpSession s,Model m) {
		User user=new User();
		user.setUser_address(address);
		user.setUser_email(email);
		user.setUser_gender(gender);
		user.setUser_name(name);
		user.setUser_password(password);
		user.setUser_phone(phone);
		user.setUser_photo(file.getOriginalFilename());
		
		
		//file store into server
		byte[] data=file.getBytes();
		
		//setting path of image
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		m.addAttribute("photo",file.getOriginalFilename());
//		if(r.hasErrors()) {
//			return "registerpage";
//		}
		this.userService.SaveUsers(user);
		return "login";
	}
}
