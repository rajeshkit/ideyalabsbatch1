package org.mtrs.controller;



import org.mtrs.dto.BusDto;
import org.mtrs.service.BusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/bus")
public class BusController {
	
	
	
	@Autowired
	private BusService busService;
	
	@RequestMapping(value = "/add/form",method = RequestMethod.POST)
	public String addBus(@ModelAttribute("busObject") BusDto busDto,Model model,HttpServletRequest request) {
		model.addAttribute("savedBusObj",busService.addBus(busDto));
		return "demo";
	}
	@RequestMapping(value="/open/form",method = RequestMethod.GET)
	public String openBusForm(Model model) {
		//logger.info("form is getting open");
		model.addAttribute("busObject", new BusDto());
	//	logger.info("model object is created attached for binding");
		return "addbusform";
	}
	
	

}
