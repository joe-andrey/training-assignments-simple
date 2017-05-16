package eu.sig.training.ch05.buildandsendmail;

public class EmployeInfo {
	public String firstName;
	public String lastName;
	public String division;

	public EmployeInfo(String firstName, String lastName, String division) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.division = division;
	}
	
	public String getMailAddress(){
		return this.firstName.charAt(0) + "." + this.lastName.substring(0, 7) + "@"
	            + this.division.substring(0, 5) + ".compa.ny";
	}
}