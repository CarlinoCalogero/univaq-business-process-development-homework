package it.univaq.disim.bpd.etsservice;

public class Employee {
	private String firstName;
	private String lastName;
	private String Department;
	
	public Employee() {
		super();
		firstName = "";
		lastName = "";
		Department = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
}
