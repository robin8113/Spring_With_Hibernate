package com.robin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.robin.model.Login;
import com.robin.model.User;
import com.robin.service.UserService;



@Controller
public class LoginServlet {
	
	@Autowired
	  public UserService userService;
	  
	  @RequestMapping(value = "/home", method = RequestMethod.GET)
	  public ModelAndView showHome() {
	    ModelAndView mav = new ModelAndView("home");
	    return mav;
	  }
	  
	  @RequestMapping(value="/loginProcess",method=RequestMethod.POST)
	  public ModelAndView show(HttpServletRequest request,HttpServletResponse response,Login login)
	  {
		  ModelAndView mav=null;
		 List<User> user=userService.validateUser(login);
		  if(user!=null)
		  {
			  mav=new ModelAndView("welcome");
			  mav.addObject("firstname",user.get(0).getFirstname());
		  }
		  else
		  {
			  mav=new ModelAndView("login");
			  mav.addObject("message","Username and password is Wrong!!");
		  }
		  return mav;
		  
	  }
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin() {
	    ModelAndView mav = new ModelAndView("login");
	    return mav;
	  }
      
	  
}
