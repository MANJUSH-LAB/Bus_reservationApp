package com.example.Buscheckin.integration;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Buscheckin.integration.dto.Reservation;
import com.example.Buscheckin.integration.dto.ReservationUpdateRequest;




public interface ReservationRestClient {
	public Reservation findReservation(@PathVariable("id") Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}
