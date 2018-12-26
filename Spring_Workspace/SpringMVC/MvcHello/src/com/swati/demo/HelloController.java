package com.swati.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController{
	@RequestMapping("/")  
	public String display()  
    {  
        return "/MvcHello/WebContent/jsp/hello";  
    }     
}

