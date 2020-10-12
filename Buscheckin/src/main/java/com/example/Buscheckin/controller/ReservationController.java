package com.example.Buscheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Buscheckin.integration.ReservationRestClient;
import com.example.Buscheckin.integration.dto.Reservation;
import com.example.Buscheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {

	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("showCheckin")
	public String showCheckin() {
		return "showCheckIn";
		
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		  modelMap.addAttribute("reservation", reservation);
		    return "reservationDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long id ,@RequestParam("numberOfBags") int numberOfBags ) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		request.setId(id);
		restClient.updateReservation(request);
		return "confirmReservation";
	}
}
