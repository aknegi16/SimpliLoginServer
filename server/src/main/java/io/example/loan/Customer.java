package io.example.loan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
	private String customerid;
	private String name;
	private String email;
	private String password;
	private String mobile;
	
	
	public Customer()
	{}
	
	public Customer(String customerid,String name,String email ,String password , String mobile)
	{super();
	this.customerid=customerid;
	this.name=name;
	this.email=email;
	this.password=password;
	this.mobile=mobile;
		
		
		
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
