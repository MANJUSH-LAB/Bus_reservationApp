package com.example.Bus_reservationApp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bus_reservationApp.Entities.Bus;
import com.example.Bus_reservationApp.Entities.Passenger;
import com.example.Bus_reservationApp.Entities.Reservation;
import com.example.Bus_reservationApp.Repository.BusRepository;
import com.example.Bus_reservationApp.Repository.PassengerRepository;
import com.example.Bus_reservationApp.Repository.ReservationRepository;
import com.example.Bus_reservationApp.dto.ReservationRequest;
import com.example.Bus_reservationApp.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

	
	@Autowired
	BusRepository busRepo;
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	
	@Override
	public Reservation bookBus(ReservationRequest request) {

		long busId = request.getBusId();
		Optional<Bus> findById = busRepo.findById(busId);
		Bus bus = findById.get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerMobile());
		passengerRepo.save(passenger);
		
		Reservation reservation =new Reservation(); //gene
		reservation.setCheckedIn(false);
		reservation.setPassenger(passenger);
		reservation.setBus(bus);
		Reservation save = reservationRepo.save(reservation);
		
		String filePath = "F:\\BusReservatin\\PathF\\itinerary\\reservations"+save.getId()+".pdf"; //Create any of folderSample
		pdfGenerator.generateItinerary(reservation, filePath);
		return save;
	}

}
