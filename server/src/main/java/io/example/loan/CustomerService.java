package io.example.loan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {
    @Autowired
	private CustomerRepository CustomerRepository ;
    
    
   
    public List<Customer> getAllCustomers()
    {     List<Customer> Customers=new ArrayList<>();
    
    	CustomerRepository.findAll().forEach(Customers::add);;
		return Customers;
    	
    }
    
    
    public void addCustomer(Customer Customers){
    	CustomerRepository.save(Customers);
    	
    	
    }
    
    public Customer getCustomer(String id){
    	return CustomerRepository.findOne(id);
    }
    
    
    public void updateCustomer(String id,Customer Customer)
    {
    	
    	CustomerRepository.save(Customer);
    }

public void deleteCustomer(String id)
{
CustomerRepository.delete(id);	
}
}
