package one.digitalinnovation.gof.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Address;
import one.digitalinnovation.gof.model.AddressRepository;
import one.digitalinnovation.gof.model.Customer;
import one.digitalinnovation.gof.model.CustomerRepository;
import one.digitalinnovation.gof.service.CustomerService;
import one.digitalinnovation.gof.service.ViaCepService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
    @Autowired
	private AddressRepository addresRepo;

	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
        
        customerRepo.findAll().forEach(item -> customers.add(item));

        return customers;
	}

	@Override
	public Customer findById(Long id) {
		Optional<Customer> cliente = customerRepo.findById(id);

		return cliente.get();
	}

	@Override
	public void create(Customer customer) {
		saveCustomerWithZipCode(customer);
	}

	@Override
	public void update(Long id, Customer customer) {
		Optional<Customer> clienteBd = customerRepo.findById(id);

		if (clienteBd.isPresent()) {
			saveCustomerWithZipCode(customer);
		}
	}

	@Override
	public void delete(Long id) {
		customerRepo.deleteById(id);
	}

	private void saveCustomerWithZipCode(Customer customer) {
		String cep = customer.getAddress().getCep();

		Address address = addresRepo.findById(cep).orElseGet(() -> {
			Address newAddress = viaCepService.checkZipCode(cep);

			addresRepo.save(newAddress);
			
            return newAddress;
		});

		customer.setAddress(address);
		
        customerRepo.save(customer);
	}

}
