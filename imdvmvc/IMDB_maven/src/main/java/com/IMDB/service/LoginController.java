package com.IMDB.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.IMDB.DAO.LoginDAO;
import com.IMDB.model.Loginuser;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    
	    String name=request.getParameter("username");
	    String password=request.getParameter("password");
	    
	    Loginuser user=new Loginuser(name, password);
	    if(new LoginDAO().check(user))
	    {
	    	mav.setViewName(" ");
	    }
	    else
	    {
	    	mav.setViewName(" ");
	    }
	    
	    mav.addObject("login", new Loginuser());
	    return mav;
	  }
}
