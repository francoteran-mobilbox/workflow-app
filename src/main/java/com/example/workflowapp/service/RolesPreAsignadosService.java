package com.example.workflowapp.service;

import com.example.workflowapp.model.RolesPreAsignados;
import com.example.workflowapp.repository.RolesPreAsignadosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesPreAsignadosService {

	private final RolesPreAsignadosRepository repository;

	public RolesPreAsignadosService(RolesPreAsignadosRepository repository) {
		this.repository = repository;
	}

	public List<RolesPreAsignados> getRolesPreAsignadosByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
