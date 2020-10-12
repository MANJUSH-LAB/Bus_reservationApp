package com.example.Bus_reservationApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bus_reservationApp.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
