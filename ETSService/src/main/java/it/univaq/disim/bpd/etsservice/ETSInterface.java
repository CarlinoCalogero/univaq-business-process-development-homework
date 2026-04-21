package it.univaq.disim.bpd.etsservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface ETSInterface {
	@WebMethod
	TravelClass employTravelStatus(Employee employee);
}
