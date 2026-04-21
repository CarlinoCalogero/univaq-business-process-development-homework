package it.univaq.disim.bpd.daservice;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService
public class DAServiceImpl implements DAInterface {
	private static final Logger LOGGER = Logger.getLogger(DAServiceImpl.class.getName());

	@Override
	public FlightConfirmation flightTicket(FlightData flightData, TravelClass travelClass) {
		LOGGER.info("\n************** Running DAService->flightTicket **************\n");
		
		FlightConfirmation flightConfirmation = new FlightConfirmation();
		
		flightConfirmation.setFlightNo("4321");
		flightConfirmation.setTravelClass(travelClass);
		flightConfirmation.setPrice(712);
		flightConfirmation.setDepartureDate(flightData.getDesiredDepartureDate());
		flightConfirmation.setReturnDate(flightData.getDesiredReturnDate());
		flightConfirmation.setApproved(true);
		
		LOGGER.info("\n************** Leaving DAService->flightTicket **************\n");
		
		return flightConfirmation;
	}
}
