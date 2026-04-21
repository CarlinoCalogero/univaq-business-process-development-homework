package it.univaq.disim.bpd.etsservice;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService
public class ETSServiceImpl implements ETSInterface {
	private static final Logger LOGGER = Logger.getLogger(ETSServiceImpl.class.getName());

	@Override
	public TravelClass employTravelStatus(Employee employee) {
		LOGGER.info("\n************** Running ETSService->employTravelStatus **************\n");
		
		TravelClass travelclass = new TravelClass();
		
		LOGGER.info("\n************** Leaving ETSService->employTravelStatus **************\n");
		
		return travelclass;
	}
}
