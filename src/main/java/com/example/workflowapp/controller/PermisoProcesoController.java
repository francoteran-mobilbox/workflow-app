package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoProceso;
import com.example.workflowapp.service.PermisoProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-proceso")
public class PermisoProcesoController {

	private final PermisoProcesoService permisoProcesoService;

	public PermisoProcesoController(PermisoProcesoService permisoProcesoService) {
		this.permisoProcesoService = permisoProcesoService;
	}

	@GetMapping
	public List<PermisoProceso> list() {
		return permisoProcesoService.getAllPermisosProceso();
	}
}
