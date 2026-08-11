package com.example.workflowapp.controller;

import com.example.workflowapp.model.RolGenericoProceso;
import com.example.workflowapp.service.RolGenericoProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles-generico-proceso")
public class RolGenericoProcesoController {

	private final RolGenericoProcesoService rolGenericoProcesoService;

	public RolGenericoProcesoController(RolGenericoProcesoService rolGenericoProcesoService) {
		this.rolGenericoProcesoService = rolGenericoProcesoService;
	}

	@GetMapping
	public List<RolGenericoProceso> list() {
		return rolGenericoProcesoService.getAllRolesGenericoProceso();
	}
}
