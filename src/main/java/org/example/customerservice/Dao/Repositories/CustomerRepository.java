package org.example.customerservice.Dao.Repositories;

import org.example.customerservice.Dao.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
