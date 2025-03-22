package one.digitalinnovation.gof.service;

import java.util.List;

import one.digitalinnovation.gof.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

	Customer findById(Long id);

	void create(Customer customer);

	void update(Long id, Customer customer);

	void delete(Long id);

}
