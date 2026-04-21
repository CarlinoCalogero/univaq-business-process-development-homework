package it.univaq.disim.bpd.aaservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface AAInterface {
	@WebMethod
	FlightConfirmation flightTicket(FlightData flightData, TravelClass travelClass);
}
