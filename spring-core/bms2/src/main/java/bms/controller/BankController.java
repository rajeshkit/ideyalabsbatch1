package bms.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bms.model.Bank;

@Controller
public class BankController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(Model model) {
		System.out.println("welcome controller");
		model.addAttribute("myName", "Rajesh Nallusamy");
		return "welcome";
	}
	@RequestMapping(value = "/bank", method = RequestMethod.GET)
	public String getBank(Model model) {
		Bank bank=new Bank();bank.setBankId(4567);bank.setBankName("SBI");bank.setAddress("hyd");
		model.addAttribute("myBank", bank);
		return "showbank";
	}
}
