package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoProcesoCondicion;
import com.example.workflowapp.service.PermisoProcesoCondicionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-proceso-condicion")
public class PermisoProcesoCondicionController {

	private final PermisoProcesoCondicionService permisoProcesoCondicionService;

	public PermisoProcesoCondicionController(PermisoProcesoCondicionService permisoProcesoCondicionService) {
		this.permisoProcesoCondicionService = permisoProcesoCondicionService;
	}

	@GetMapping
	public List<PermisoProcesoCondicion> list() {
		return permisoProcesoCondicionService.getAllPermisosProcesoCondicion();
	}
}
