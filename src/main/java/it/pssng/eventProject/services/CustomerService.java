package it.pssng.eventProject.services;

import it.pssng.eventProject.entities.Customer;
import it.pssng.eventProject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){this.customerRepository = customerRepository; }

    public Customer findCustomerById(String fiscalCode){
        Optional<Customer> foundCustomer = customerRepository.findById(fiscalCode);
        return foundCustomer.orElse(null);
    }

    public List<Customer> findListAll(){
        List<Customer> foundCustomer = customerRepository.findAll();
        return foundCustomer;
    }

}
