package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoRolProceso;
import com.example.workflowapp.repository.PermisoRolProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoRolProcesoService {

	private final PermisoRolProcesoRepository repository;

	public PermisoRolProcesoService(PermisoRolProcesoRepository repository) {
		this.repository = repository;
	}

	public List<PermisoRolProceso> getAllPermisosRolProceso() {
		return repository.findAll();
	}
}
