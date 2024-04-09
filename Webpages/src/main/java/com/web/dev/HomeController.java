package com.web.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    
    @GetMapping("/contact")
    public String contact() {
    	return "contact";
    }
    

}