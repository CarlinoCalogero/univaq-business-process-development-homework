package it.univaq.disim.bpd.aaservice;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService
public class AAServiceImpl implements AAInterface {
	private static final Logger LOGGER = Logger.getLogger(AAServiceImpl.class.getName());

	@Override
	public FlightConfirmation flightTicket(FlightData flightData, TravelClass travelClass) {
		LOGGER.info("\n************** Running AAService->flightTicket **************\n");
		
		FlightConfirmation flightConfirmation = new FlightConfirmation();
		
		flightConfirmation.setFlightNo("1234");
		flightConfirmation.setTravelClass(travelClass);
		flightConfirmation.setPrice(547);
		flightConfirmation.setDepartureDate(flightData.getDesiredDepartureDate());
		flightConfirmation.setReturnDate(flightData.getDesiredReturnDate());
		flightConfirmation.setApproved(true);
		
		LOGGER.info("\n************** Leaving AAService->flightTicket **************\n");

		return flightConfirmation;
	}
}
