package com.example.workflowapp.controller;

import com.example.workflowapp.model.RolGenericoActividad;
import com.example.workflowapp.service.RolGenericoActividadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles-generico-actividad")
public class RolGenericoActividadController {

	private final RolGenericoActividadService rolGenericoActividadService;

	public RolGenericoActividadController(RolGenericoActividadService rolGenericoActividadService) {
		this.rolGenericoActividadService = rolGenericoActividadService;
	}

	@GetMapping
	public List<RolGenericoActividad> list() {
		return rolGenericoActividadService.getAllRolesGenericoActividad();
	}
}
