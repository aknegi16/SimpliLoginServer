package io.example.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoanService {
    @Autowired
	private LoanRepository LoanRepository ;
    
    
   
    public List<Loan> getAllLoans(String Customerid)
    {     List<Loan> Loans=new ArrayList<>();
    
    	LoanRepository.findByCustomerCustomerid(Customerid).forEach(Loans::add);;
		return Loans;
    	
    }
    
    
    public void addLoan(Loan Loans){
    	LoanRepository.save(Loans);
    	
    	
    }
    
    public Loan getLoan(String id){
    	return LoanRepository.findOne(id);
    }
    
    
    public void updateLoan(String id,Loan Loan)
    {
    	
    	LoanRepository.save(Loan);
    }

public void deleteLoan(String id)
{
LoanRepository.delete(id);	
}
}
