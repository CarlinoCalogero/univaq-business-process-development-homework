package it.univaq.disim.bpd.daclient;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DAClient {

	public static void main(String[] args) {
		TravelClass tc = new TravelClass();
		tc.setTravelclasstype(TravelClassType.ECONOMY);
		
		FlightData fd = new FlightData();
		fd.setOriginFrom("Paris");
		fd.setDestinationTo("Rome");
		
		XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        Date current_date = new Date();
        gc.setTime(current_date);
        try {
            xmlDate = DatatypeFactory.newInstance()
                          .newXMLGregorianCalendar(gc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		
		fd.setDesiredDepartureDate(xmlDate);
		fd.setDesiredReturnDate(xmlDate);
		
		DAServiceImplService aaService = new DAServiceImplService();
		DAInterface aaPort = aaService.getDAServiceImplPort();
		FlightConfirmation fc = aaPort.flightTicket(fd, tc);
		
		System.out.println("The flight ticket from DA costs " + fc.getPrice() + " euros.");
	}

}
