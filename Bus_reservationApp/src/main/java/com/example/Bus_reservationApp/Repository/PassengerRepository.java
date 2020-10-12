package com.example.Bus_reservationApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bus_reservationApp.Entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
