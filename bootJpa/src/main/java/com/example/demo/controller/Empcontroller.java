package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DataInterface;
import com.example.demo.model.Employee;

@Controller
public class Empcontroller {
	
	@Autowired
	DataInterface d;
	@RequestMapping("/")
	public String home()
	{
		
		return "Home.jsp";
	}
	@RequestMapping("/addemp")
	public String addemp(Employee emp)
	{
		d.save(emp);
		return "Home.jsp";
	}
	
	@RequestMapping("/getemp")
	public ModelAndView getemp(@RequestParam int eid)
	{
		ModelAndView mv=new ModelAndView("View.jsp");
		
		Employee emp=d.findById(eid).orElse(null);
		System.out.println(emp);
		mv.addObject("details", emp);
		//System.out.println(mv);
		return mv;
	}

}
