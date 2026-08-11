package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoProceso;
import com.example.workflowapp.repository.PermisoProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoProcesoService {

	private final PermisoProcesoRepository repository;

	public PermisoProcesoService(PermisoProcesoRepository repository) {
		this.repository = repository;
	}

	public List<PermisoProceso> getAllPermisosProceso() {
		return repository.findAll();
	}
}
