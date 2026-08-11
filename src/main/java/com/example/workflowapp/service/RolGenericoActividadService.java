package com.example.workflowapp.service;

import com.example.workflowapp.model.RolGenericoActividad;
import com.example.workflowapp.repository.RolGenericoActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolGenericoActividadService {

	private final RolGenericoActividadRepository repository;

	public RolGenericoActividadService(RolGenericoActividadRepository repository) {
		this.repository = repository;
	}

	public List<RolGenericoActividad> getAllRolesGenericoActividad() {
		return repository.findAll();
	}
}
