	package it.univaq.disim.bpd.daservice;

public class TravelClass {
	private enum TravelClassType {
		ECONOMY, BUSINESS, FIRST
	} 
	
	private TravelClassType travelclasstype;

	public TravelClass() {
		super();
		travelclasstype = TravelClassType.ECONOMY;
	}

	public TravelClassType getTravelclasstype() {
		return travelclasstype;
	}

	public void setTravelclasstype(TravelClassType travelclasstype) {
		this.travelclasstype = travelclasstype;
	}
}
