package com.mvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView printHello() {
		ModelAndView model=new ModelAndView("/helloworld");
		model.addObject("message", "Hello Spring MVC Framework!");
		return model;// view name
	}
}
