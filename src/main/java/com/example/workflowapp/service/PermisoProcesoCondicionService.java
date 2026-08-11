package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoProcesoCondicion;
import com.example.workflowapp.repository.PermisoProcesoCondicionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoProcesoCondicionService {

	private final PermisoProcesoCondicionRepository repository;

	public PermisoProcesoCondicionService(PermisoProcesoCondicionRepository repository) {
		this.repository = repository;
	}

	public List<PermisoProcesoCondicion> getAllPermisosProcesoCondicion() {
		return repository.findAll();
	}
}
