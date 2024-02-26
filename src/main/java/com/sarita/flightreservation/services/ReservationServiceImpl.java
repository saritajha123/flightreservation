package com.sarita.flightreservation.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarita.flightreservation.controllers.ReservationController;
import com.sarita.flightreservation.dto.ReservationRequest;
import com.sarita.flightreservation.entities.Flight;
import com.sarita.flightreservation.entities.Passenger;
import com.sarita.flightreservation.entities.Reservation;
import com.sarita.flightreservation.repos.FlightRepository;
import com.sarita.flightreservation.repos.PassengerRepository;
import com.sarita.flightreservation.repos.ReservationRepository;
import com.sarita.flightreservation.util.EmailUtil;
import com.sarita.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService{
	@Value("${com.sarita.flightreservation.itinerary.dirpath}")
	private String ITINERARY_DIR;
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	PassengerRepository passsengerRepository;
	 @Autowired
	ReservationRepository reservationRepository; 
	 @Autowired
	 PDFGenerator pdfGenerator;
	 @Autowired
	 EmailUtil emailUtil;
	 
	 private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);
		
	
	@Override
	@Transactional
	 public Reservation bookFlight(ReservationRequest request) {
		
		LOGGER.info("Inside bookFlight()");
		
		//Make Payment
		
		Long flightId = request.getFlightId();
		LOGGER.info("Fetching flight for flight id:"+flightId);
		 Optional<Flight> flight =flightRepository.findById(flightId);
		
		  Passenger passenger = new Passenger();
		  passenger.setFirstName(request.getPassengerFirstName());
		  passenger.setLastName(request.getPassengerLastName());
		  passenger.setPhone(request.getPassengerPhone());
		  passenger.setEmail(request.getPassengerEmail());
		  LOGGER.info("Saving the passenger :"+passenger);
		  Passenger savedPassenger = passsengerRepository.save(passenger);
		  
		  Reservation reservation = new Reservation();
		  reservation.setFlight(flight.get());
		  reservation.setPassenger(savedPassenger);
		  reservation.setChekedIn(false);
		  
		  LOGGER.info("Saving the reservation :"+reservation);
		  
		  Reservation savedReservation =reservationRepository.save(reservation);
		  String filePath=ITINERARY_DIR+savedReservation.getId()+".pdf";
		  LOGGER.info("Generate the Itinerary");
		  pdfGenerator.generateItinerary(savedReservation,filePath);
		  LOGGER.info("Emailing the Itinerary");
		  emailUtil.sendItinerary(passenger.getEmail(), filePath);
		  
		 return savedReservation;
	 }

}
