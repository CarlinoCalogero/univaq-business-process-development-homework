package it.univaq.disim.bpd.businesstravelclient;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class BusinessTravelClient {

	public static void main(String[] args) {
		BusinessTravelService process = new BusinessTravelService();
		BusinessTravel processPort = process.getBusinessTravelPort();
		
		Employee employee = new Employee();
		FlightData flightData = new FlightData();
		
		employee.setFirstName("Massimo");
		employee.setLastName("Tivoli");
		employee.setDepartment("DISM");
		
		flightData.setOriginFrom("Rome");
		flightData.setDestinationTo("Paris");
		
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
        
        flightData.setDesiredDepartureDate(xmlDate);
        flightData.setDesiredReturnDate(xmlDate);
		
		FlightConfirmation fc = processPort.travelApproval(employee, flightData);
		
		System.out.println("The chepeast flight ticket comes from the flight no. " + fc.getFlightNo() + " and it costs " + fc.getPrice() + " euros.");
	}

}
