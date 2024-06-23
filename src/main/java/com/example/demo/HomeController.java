package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Alien al){
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",al);
		mv.setViewName("Home");
		System.out.println(al.getAname());
		return mv;
	}
}
