package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Customer;
import one.digitalinnovation.gof.service.CustomerService;

@RestController
@RequestMapping("clientes")
public class CustomerRestController {

	@Autowired
	private CustomerService clienteService;

	@GetMapping
	public ResponseEntity<Iterable<Customer>> buscarTodos() {
		return ResponseEntity.ok(clienteService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Customer> inserir(@RequestBody Customer cliente) {
		clienteService.create(cliente);
		
        return ResponseEntity.ok(cliente);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Customer> atualizar(@PathVariable Long id, @RequestBody Customer cliente) {
		clienteService.update(id, cliente);
		
        return ResponseEntity.ok(cliente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		clienteService.delete(id);

		return ResponseEntity.ok().build();
	}
}
