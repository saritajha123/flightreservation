package com.sarita.flightreservation.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sarita.flightreservation.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}