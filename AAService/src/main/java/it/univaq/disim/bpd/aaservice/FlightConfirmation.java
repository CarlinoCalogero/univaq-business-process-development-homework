package it.univaq.disim.bpd.aaservice;

import java.util.Date;

public class FlightConfirmation {
	private String flightNo;
	private TravelClass travelClass;
	private float price;
	private Date departureDate;
	private Date returnDate;
	private boolean approved;
	
	public FlightConfirmation() {
		super();
		flightNo = "";
		travelClass = new TravelClass();
		price = 0;
		departureDate = new Date();
		returnDate = new Date();
		approved = false;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public TravelClass getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(TravelClass travelClass) {
		this.travelClass = travelClass;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
