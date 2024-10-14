package org.example.customerservice.Service;

import org.example.customerservice.Dao.Entities.Customer;
import org.example.customerservice.Dao.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> customerList(){
        return customerRepository.findAll();
    }

    public Customer customerById(Long id){
        return customerRepository.findById(id).orElseThrow();
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
