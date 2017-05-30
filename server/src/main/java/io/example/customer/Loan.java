package io.example.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
    
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
	
	private String loanamount;
	private String purpose;
	private String time;
	private String street;
	private String city;
	private String state;
	private String pincode;
	@ManyToOne(cascade = {CascadeType.ALL})
	private Customer customer ;  ///many to one relationship 
	
	public Loan()
	{}
	
	
	public Customer getCustomer() {
		return customer;
	}
	/**/
	/* */

	public Loan(Long id, String loanamount, String purpose, String time, String street, String city,
			String state, String pincode, Customer customer) {
		super();
		this.id = id;
		
		this.loanamount = loanamount;
		this.purpose = purpose;
		this.time = time;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customer=customer;
	   
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	public String getLoanamount() {
		return loanamount;
	}


	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	




	
	
	
}
