package com.example.workflowapp.service;

import com.example.workflowapp.model.ResponsableProceso;
import com.example.workflowapp.repository.ResponsableProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableProcesoService {

	private final ResponsableProcesoRepository repository;

	public ResponsableProcesoService(ResponsableProcesoRepository repository) {
		this.repository = repository;
	}

	public List<ResponsableProceso> getAllResponsablesProceso() {
		return repository.findAll();
	}
}
