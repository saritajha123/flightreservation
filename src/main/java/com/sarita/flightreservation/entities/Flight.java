package com.sarita.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
@Entity
//@DateTimeFormat(pattern ="DD/MM/YYYY") 
//@Temporal(TemporalType.DATE)


public class Flight extends AbstractEntity {
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}
	private String flightNumber;
	private String operatingAirlines; 
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateofDeparture() {
		return dateOfDeparture;
	}
	public void setDateofDeparture(Date dateofDeparture) {
		this.dateOfDeparture = dateofDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
