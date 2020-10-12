 package com.example.Bus_reservationApp.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bus_reservationApp.Entities.Reservation;
import com.example.Bus_reservationApp.Repository.ReservationRepository;
import com.example.Bus_reservationApp.dto.ReservationUpdateRequest;

@RestController

public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepo;
	
	@RequestMapping("/reservation/{id}")    //GETmethod
	public Reservation findReservation(@PathVariable("id") Long id) {
		
		Optional<Reservation> findById = reservationRepo.findById(id);
		return findById.get();
	}
	
	@RequestMapping("/reservation") 

	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		long id = request.getId();
		Optional<Reservation> findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		
		return reservationRepo.save(reservation);
		
	}
}
