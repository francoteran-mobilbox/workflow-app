package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoRolDocComun;
import com.example.workflowapp.repository.PermisoRolDocComunRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoRolDocComunService {

	private final PermisoRolDocComunRepository repository;

	public PermisoRolDocComunService(PermisoRolDocComunRepository repository) {
		this.repository = repository;
	}

	public List<PermisoRolDocComun> getAllPermisosRolDocComun() {
		return repository.findAll();
	}
}
