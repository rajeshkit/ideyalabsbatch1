package springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeCustomer(Model model) {  // web request method
		model.addAttribute("myName", "Rajesh");
		return "ideyalabs"; //viewname- ideyalabs
	}
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String welcomeCustomer1(Model model) {  // web request method
		model.addAttribute("myName", "Rajesh");
		return "demo"; //viewname- ideyalabs
	}

}
