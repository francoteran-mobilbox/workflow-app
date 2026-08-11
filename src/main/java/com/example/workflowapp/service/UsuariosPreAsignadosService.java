package com.example.workflowapp.service;

import com.example.workflowapp.model.UsuariosPreAsignados;
import com.example.workflowapp.repository.UsuariosPreAsignadosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosPreAsignadosService {

	private final UsuariosPreAsignadosRepository repository;

	public UsuariosPreAsignadosService(UsuariosPreAsignadosRepository repository) {
		this.repository = repository;
	}

	public List<UsuariosPreAsignados> getUsuariosPreAsignadosByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
