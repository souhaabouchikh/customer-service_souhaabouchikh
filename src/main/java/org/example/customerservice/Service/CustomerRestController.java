    package org.example.customerservice.Service;

    import org.example.customerservice.Dao.Entities.Customer;
    import org.example.customerservice.Dao.Repositories.CustomerRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
        @RequestMapping("/api/customers")
    public class CustomerRestController {
        @Autowired
        private CustomerRepository customerRepository;

        @GetMapping
        public List<Customer> customerList(){
            return customerRepository.findAll();
        }

        @GetMapping("/{id}")
        public Customer customerById(@PathVariable Long id){
            return customerRepository.findById(id).orElse(null);
        }

        @PostMapping
        public Customer saveCustomer(@RequestBody Customer customer){
            return customerRepository.save(customer);
        }
    }
