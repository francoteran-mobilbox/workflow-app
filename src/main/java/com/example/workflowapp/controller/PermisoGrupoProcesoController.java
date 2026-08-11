package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoGrupoProceso;
import com.example.workflowapp.service.PermisoGrupoProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-grupo-proceso")
public class PermisoGrupoProcesoController {

	private final PermisoGrupoProcesoService permisoGrupoProcesoService;

	public PermisoGrupoProcesoController(PermisoGrupoProcesoService permisoGrupoProcesoService) {
		this.permisoGrupoProcesoService = permisoGrupoProcesoService;
	}

	@GetMapping
	public List<PermisoGrupoProceso> list() {
		return permisoGrupoProcesoService.getAllPermisosGrupoProceso();
	}
}
