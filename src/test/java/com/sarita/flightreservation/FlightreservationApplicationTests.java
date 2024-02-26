package com.sarita.flightreservation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarita.flightreservation.entities.Reservation;
import com.sarita.flightreservation.repos.ReservationRepository;
import com.sarita.flightreservation.util.EmailUtil;
import com.sarita.flightreservation.util.PDFGenerator;

@SpringBootTest
class FlightreservationApplicationTests {
	@Autowired
	 ReservationRepository reservationRepository;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}
	@Test
	public void testGenerateItenarary() {
		 Reservation reservation = reservationRepository.findById(1L).get();
		  String filePath="C:\\Users\\nandk\\OneDrive\\Desktop\\Reservation/reservation"+reservation.getId()+".pdf";
		  pdfGenerator.generateItinerary(reservation,filePath);
		  
	}
	
//	@Test
	public void testEmail() {
	 Reservation reservation = reservationRepository.findById(1L).get();
	  String filePath="C:\\Users\\nandk\\OneDrive\\Desktop\\Reservation/reservation"+reservation.getId()+".pdf";
	  pdfGenerator.generateItinerary(reservation,filePath);
	  
	  emailUtil.sendItinerary("saritajha37@gmail.com", filePath);

}
}