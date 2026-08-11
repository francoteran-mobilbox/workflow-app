package com.example.workflowapp.service;

import com.example.workflowapp.model.PermisoGrupoProceso;
import com.example.workflowapp.repository.PermisoGrupoProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoGrupoProcesoService {

	private final PermisoGrupoProcesoRepository repository;

	public PermisoGrupoProcesoService(PermisoGrupoProcesoRepository repository) {
		this.repository = repository;
	}

	public List<PermisoGrupoProceso> getAllPermisosGrupoProceso() {
		return repository.findAll();
	}
}
