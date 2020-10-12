package com.example.Bus_reservationApp.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bus_reservationApp.Entities.Bus;
import com.example.Bus_reservationApp.Entities.Reservation;
import com.example.Bus_reservationApp.Repository.BusRepository;
import com.example.Bus_reservationApp.dto.ReservationRequest;
import com.example.Bus_reservationApp.services.ReservationService;



@Controller
public class ReservationController {
	@Autowired
	BusRepository busRepo;
	
	
	@Autowired
	ReservationService reservationService;
	
	
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("busId") Long id,ModelMap modelMap) {
		
		 Optional<Bus> findById = busRepo.findById(id);
		 Bus bus = findById.get();
		 modelMap.addAttribute("bus", bus);
		return "completeReservation";
		
	}
	
	@RequestMapping("/confirmRegistration")
	public String confirmRegistration(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookBus(request);
		modelMap.addAttribute("msg", "Your booking is confirmed. Your booking id is" + reservation.getId());
		return "bookingConfirmation";
	}
		
	
}
