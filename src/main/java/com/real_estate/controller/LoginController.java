package com.real_estate.controller;
import com.real_estate.models.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.real_estate.service.UserService;
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	User u=new User();
	@RequestMapping(path="/ServletLogin",method=RequestMethod.POST)
	public String login(@RequestParam("user_email") String email,@RequestParam("user_password") String password,Model m,HttpSession session) {
		User user=userService.loginUsers(email, password);

		if(user!=null) {
			session.setAttribute("loginUser",user);
			m.addAttribute("login", user);
			u.setId(user.getId());
			u.setUser_address(user.getUser_address());
			u.setUser_email(user.getUser_email());
			u.setUser_gender(user.getUser_gender());
			u.setUser_name(user.getUser_name());
			u.setUser_password(user.getUser_password());
			u.setUser_phone(user.getUser_phone());
			u.setUser_photo(user.getUser_photo());
			return"profilepage";
		}
		else {
			m.addAttribute("msg","Please Register Your Self: Then Try Again to Login");
			return "registerpage";
		}
	}
	
	@RequestMapping("/ServletLogout")
	public String Logout(HttpSession session) {
		session.setAttribute("loginUser", null);
//		u=null;
		return "index";
	}
	
	@RequestMapping("/profile")
	public String profile(Model m) {
		m.addAttribute("data", u);
		return "profile";
	}
}
