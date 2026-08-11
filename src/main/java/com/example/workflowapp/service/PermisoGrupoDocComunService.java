package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoGrupoDocComun;
import com.example.workflowapp.repository.PermisoGrupoDocComunRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoGrupoDocComunService {

	private final PermisoGrupoDocComunRepository repository;

	public PermisoGrupoDocComunService(PermisoGrupoDocComunRepository repository) {
		this.repository = repository;
	}

	public List<PermisoGrupoDocComun> getAllPermisosGrupoDocComun() {
		return repository.findAll();
	}
}
