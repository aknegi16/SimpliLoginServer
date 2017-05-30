package io.example.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan ,String>  {

	public List<Loan> findByCustomerCustomerid(String Loanid);
	
	//getAllTopic()
	//getTopic
}
