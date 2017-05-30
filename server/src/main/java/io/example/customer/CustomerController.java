package io.example.customer;

import java.util.List;

import javax.xml.ws.ResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
  @Autowired
	private CustomerService CustomerService;
    
    @RequestMapping("/Customers")
    public List<Customer> getAllCustomers() {
    	
        return CustomerService.getAllCustomers();
    }
    
    
    @RequestMapping(value="/Customers/{id}",method=RequestMethod.GET)
    public Customer getCustomer(@PathVariable String id)
    {
    	List<Customer> cust= CustomerService.getCustomer(id);
    	return cust.get(0);
    } 
    
    @RequestMapping(method=RequestMethod.POST,value="/Customers")
    public int addCustomer(@RequestBody Customer Customer)
    {
    	CustomerService.addCustomer(Customer);
    	return 1;
    	
    }
    
}
