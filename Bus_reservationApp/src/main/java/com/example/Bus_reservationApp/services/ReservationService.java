package com.example.Bus_reservationApp.services;

import com.example.Bus_reservationApp.Entities.Reservation;
import com.example.Bus_reservationApp.dto.ReservationRequest;

public interface ReservationService {

	Reservation bookBus(ReservationRequest request);
	

}
