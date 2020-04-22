package com.nttdata.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getHomePage()
	{
		System.out.println("Inside  / Mapping Method");
		return"home";
	}
	@RequestMapping("/welcome")
	public String getWelcomePage()
	{
		return"welcome";
	}
	
}
