package tn.fst.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String hello(){
		
		 return "helloMvc";
	}
	@RequestMapping("/hello1")
	public ModelAndView hello1(){
		System.out.println("hello");
		
		return new ModelAndView("helloMvc", "message","Hello MVC");
	}

}
