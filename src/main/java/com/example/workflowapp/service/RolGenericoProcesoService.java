package com.example.workflowapp.service;

import com.example.workflowapp.model.RolGenericoProceso;
import com.example.workflowapp.repository.RolGenericoProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolGenericoProcesoService {

	private final RolGenericoProcesoRepository repository;

	public RolGenericoProcesoService(RolGenericoProcesoRepository repository) {
		this.repository = repository;
	}

	public List<RolGenericoProceso> getAllRolesGenericoProceso() {
		return repository.findAll();
	}
}
