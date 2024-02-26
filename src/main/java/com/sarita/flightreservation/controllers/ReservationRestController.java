package com.sarita.flightreservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarita.flightreservation.dto.ReservationUpdateRequest;
import com.sarita.flightreservation.entities.Reservation;
import com.sarita.flightreservation.repos.ReservationRepository;
import com.sarita.flightreservation.services.ReservationServiceImpl;

@RestController
public class ReservationRestController {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(ReservationRestController.class);

	@Autowired
	ReservationRepository reservationRepository;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		LOGGER.info("Inside findReservation() for id:"+id);
		return reservationRepository.getById(id);

	}

	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		LOGGER.info("Inside updateReservation() for"+request);
		
		Reservation reservation = reservationRepository.getById(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setChekedIn(request.getCheckedIn());
		LOGGER.info("Saving Reservation");
		return reservationRepository.save(reservation);

	}

}