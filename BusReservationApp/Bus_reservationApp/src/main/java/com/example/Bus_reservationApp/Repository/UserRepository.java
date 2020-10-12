package com.example.Bus_reservationApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bus_reservationApp.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
