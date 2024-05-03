package edu.iu.c322.midterm.repository;

import edu.iu.c322.midterm.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository
        extends CrudRepository<Customer, String> {
    List<Customer> findAll();
    Customer findByUsername(String username);
}



