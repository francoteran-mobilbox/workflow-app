package com.example.workflowapp.service;

import com.example.workflowapp.model.ClaveRegistroExterno;
import com.example.workflowapp.repository.ClaveRegistroExternoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaveRegistroExternoService {

	private final ClaveRegistroExternoRepository repository;

	public ClaveRegistroExternoService(ClaveRegistroExternoRepository repository) {
		this.repository = repository;
	}

	public List<ClaveRegistroExterno> getAllClavesRegistroExterno() {
		return repository.findAll();
	}
}
