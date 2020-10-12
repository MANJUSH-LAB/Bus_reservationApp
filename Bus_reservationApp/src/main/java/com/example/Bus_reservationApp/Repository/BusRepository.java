package com.example.Bus_reservationApp.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Bus_reservationApp.Entities.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

	@Query("from Bus where departureCity=:departureCity and arrivalCity =:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Bus> findBuss(String departureCity, String arrivalCity, Date dateOfDeparture);


}
