package com.sarita.flightreservation.services;

import com.sarita.flightreservation.dto.ReservationRequest;
import com.sarita.flightreservation.entities.Reservation;

public interface ReservationService {
	 
	public Reservation bookFlight(ReservationRequest request);

}
