package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoUsuarioDocComun;
import com.example.workflowapp.repository.PermisoUsuarioDocComunRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoUsuarioDocComunService {

	private final PermisoUsuarioDocComunRepository repository;

	public PermisoUsuarioDocComunService(PermisoUsuarioDocComunRepository repository) {
		this.repository = repository;
	}

	public List<PermisoUsuarioDocComun> getAllPermisosUsuarioDocComun() {
		return repository.findAll();
	}
}
