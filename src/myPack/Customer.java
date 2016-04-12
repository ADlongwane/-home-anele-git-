package myPack;
// Author: Anele Dlongwane


public class Customer {

	private int Customer_ID;
	private String Customer_Name;
	private String Customer_Surname;
	private String Customer_Address;
	private int Phone;

	public Customer() {}
	
	public Customer(String fname, String lname, int Tel, String Add) {
	this.Customer_Name = fname;
	this.Customer_Surname = lname;
	this.Phone = Tel;
	this.Customer_Address = Add;
	}
	public int getID() {
	return Customer_ID;
	}
	public void setID( int Customer_ID ) {
	this.Customer_ID = Customer_ID;
	}
	public String getCustomer_Name() {
	return Customer_Name;
	}
	public void setFirstName( String first_Name ) {
	this.Customer_Name = first_Name;
	}
	public String getLastName() {
	return Customer_Surname;
	}
	public void setLastName( String last_name ) {
	this.Customer_Surname = last_name;
	}
	public int getTel() {
	return Phone;
	}
	public void setTel( int Tel ) {
	this.Phone = Tel;
	}
	public String getPlace() {
	return Customer_Address;
	}
	public void setPlace( String Place ) {
	this.Customer_Address = Place;
	}
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
