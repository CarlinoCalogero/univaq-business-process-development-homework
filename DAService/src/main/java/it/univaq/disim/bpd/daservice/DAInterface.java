package it.univaq.disim.bpd.daservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface DAInterface {
	@WebMethod
	FlightConfirmation flightTicket(FlightData flightData, TravelClass travelClass);
}
