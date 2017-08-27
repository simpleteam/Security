package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public String main(Model model){
		model.addAttribute("message", "hello world");
		return "index";
	}
	
	@RequestMapping(value="security", method = RequestMethod.GET)
	public String security(Model model){
		model.addAttribute("message", "security message");
		return "security";
	}
	
	
}
