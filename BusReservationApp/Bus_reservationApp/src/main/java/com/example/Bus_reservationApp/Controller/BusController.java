package com.example.Bus_reservationApp.Controller;


import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bus_reservationApp.Entities.Bus;
import com.example.Bus_reservationApp.Repository.BusRepository;



@Controller
public class BusController {
	
	@Autowired
	BusRepository busRepo ;
	
	
	
	
      @RequestMapping("/findBuss")
	     public String findBuss(@RequestParam("from") String from, @RequestParam("to") String to,@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
    	  List<Bus> buss = busRepo.findBuss(from, to , departureDate);
    	  modelMap.addAttribute("buss", buss);
		return "displayBuss";
		
	}
}
