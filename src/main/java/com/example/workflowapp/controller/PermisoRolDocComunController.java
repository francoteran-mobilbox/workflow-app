package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoRolDocComun;
import com.example.workflowapp.service.PermisoRolDocComunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-rol-doc-comun")
public class PermisoRolDocComunController {

	private final PermisoRolDocComunService permisoRolDocComunService;

	public PermisoRolDocComunController(PermisoRolDocComunService permisoRolDocComunService) {
		this.permisoRolDocComunService = permisoRolDocComunService;
	}

	@GetMapping
	public List<PermisoRolDocComun> list() {
		return permisoRolDocComunService.getAllPermisosRolDocComun();
	}
}
