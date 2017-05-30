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

public class LoanController {
  @Autowired
	private LoanService LoanService;
    
    @RequestMapping("/Customers/{id}/Loans")
    public Loan getAllLoans(@PathVariable String id) {
    	List<Loan> loans=LoanService.getAllLoans(id);
        return loans.get(0);
    }
    
    
    @RequestMapping(value="/Customers/{Custid}/Loans/{id}",method=RequestMethod.GET)
    public Loan getLoan(@PathVariable Long id)
    {   
    	return LoanService.getLoan(id.toString());
    } 
    
    @RequestMapping(method=RequestMethod.POST,value="/Customers/{Custid}/Loans")
    public int addLoan(@RequestBody Loan Loan,@PathVariable String Custid) 
    {   Loan.setCustomer(new Customer(Custid,"","","",""));
    
    	LoanService.addLoan(Loan);
    	return 1;
    	
    }
    
}
