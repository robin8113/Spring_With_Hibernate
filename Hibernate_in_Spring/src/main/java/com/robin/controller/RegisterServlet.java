package com.robin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.robin.model.User;
import com.robin.service.UserService;



@Controller
public class RegisterServlet {
	@Autowired
	  public UserService userService;

	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public ModelAndView showHome() {
	    ModelAndView mav = new ModelAndView("home");
	    return mav;
	  }
	  
	  
	  
	  
	  @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister() 
	  {
	    ModelAndView mav = new ModelAndView("register");
	    return mav;
	  }
	  
	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView reg(HttpServletRequest request,HttpServletResponse response,User user)
	  {
		  userService.register(user);
		return new ModelAndView("welcome","firstname",user.getUsername());
		  
	  }
	  
	
	  

}
