package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoRolProceso;
import com.example.workflowapp.service.PermisoRolProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-rol-proceso")
public class PermisoRolProcesoController {

	private final PermisoRolProcesoService permisoRolProcesoService;

	public PermisoRolProcesoController(PermisoRolProcesoService permisoRolProcesoService) {
		this.permisoRolProcesoService = permisoRolProcesoService;
	}

	@GetMapping
	public List<PermisoRolProceso> list() {
		return permisoRolProcesoService.getAllPermisosRolProceso();
	}
}
