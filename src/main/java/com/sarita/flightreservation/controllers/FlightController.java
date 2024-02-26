package com.sarita.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sarita.flightreservation.entities.Flight;
import com.sarita.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);
	
	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from")String from,
			@RequestParam("to")String to,@RequestParam("departureDate")@DateTimeFormat(pattern="MM-dd-yyyy")
	Date departureDate,ModelMap modelMap) {
       LOGGER.info("Inside findflights()from:"+"TO:"+to+"DepartureDate"+departureDate);
	
		List<Flight> flights = flightRepository.findFlight(from,to,departureDate);
		
		modelMap.addAttribute("flights",flights);
		  LOGGER.info("flight found are:"+flights);
		return "login/displayFlights";
	}
	@RequestMapping("admin/showAddFlight")
	public String showAddFlight() {
		return "addFlight";
	}
	
}
