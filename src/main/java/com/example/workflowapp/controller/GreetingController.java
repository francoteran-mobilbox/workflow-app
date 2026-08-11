package com.example.workflowapp.controller;

import com.example.workflowapp.model.Greeting;
import com.example.workflowapp.repository.GreetingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

	private final GreetingRepository repository;

	public GreetingController(GreetingRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Greeting> list() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Greeting> get(@PathVariable Long id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Greeting create(@RequestBody Greeting greeting) {
		return repository.save(greeting);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
