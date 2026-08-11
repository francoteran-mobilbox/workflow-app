package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoGrupoDocComun;
import com.example.workflowapp.service.PermisoGrupoDocComunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-grupo-doc-comun")
public class PermisoGrupoDocComunController {

	private final PermisoGrupoDocComunService permisoGrupoDocComunService;

	public PermisoGrupoDocComunController(PermisoGrupoDocComunService permisoGrupoDocComunService) {
		this.permisoGrupoDocComunService = permisoGrupoDocComunService;
	}

	@GetMapping
	public List<PermisoGrupoDocComun> list() {
		return permisoGrupoDocComunService.getAllPermisosGrupoDocComun();
	}
}
