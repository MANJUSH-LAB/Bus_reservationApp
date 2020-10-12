package com.example.Bus_reservationApp.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;




@Entity
public class Reservation extends AbstractEntity {

	private boolean checkedIn;
	   private int numberOfBags;
	   
	   
	   @OneToOne
	   Passenger passenger;
	   
	   @OneToOne
	   Bus bus;

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
}
