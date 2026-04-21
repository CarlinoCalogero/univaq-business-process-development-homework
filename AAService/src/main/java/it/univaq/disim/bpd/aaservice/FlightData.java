package it.univaq.disim.bpd.aaservice;

import java.util.Date;

public class FlightData {
	private String originFrom;
	private String destinationTo;
	private Date desiredDepartureDate;
	private Date desiredReturnDate;
	
	public FlightData() {
		super();
		originFrom = "";
		destinationTo = "";
		desiredDepartureDate = new Date();
		desiredReturnDate = new Date();
	}

	public String getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(String originFrom) {
		this.originFrom = originFrom;
	}

	public String getDestinationTo() {
		return destinationTo;
	}

	public void setDestinationTo(String destinationTo) {
		this.destinationTo = destinationTo;
	}

	public Date getDesiredDepartureDate() {
		return desiredDepartureDate;
	}

	public void setDesiredDepartureDate(Date desiredDepartureDate) {
		this.desiredDepartureDate = desiredDepartureDate;
	}

	public Date getDesiredReturnDate() {
		return desiredReturnDate;
	}

	public void setDesiredReturnDate(Date desiredReturnDate) {
		this.desiredReturnDate = desiredReturnDate;
	}
}
