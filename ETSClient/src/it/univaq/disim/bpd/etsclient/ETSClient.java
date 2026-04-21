package it.univaq.disim.bpd.etsclient;

public class ETSClient {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setFirstName("Massimo");
		em.setLastName("Tivoli");
		em.setDepartment("DISM");
		
		ETSServiceImplService etsService = new ETSServiceImplService();
		ETSInterface etsPort = etsService.getETSServiceImplPort();
		TravelClass tc = etsPort.employTravelStatus(em);
		
		System.out.println("The travel class is " + tc.getTravelclasstype().value() + " class.");
	}

}
