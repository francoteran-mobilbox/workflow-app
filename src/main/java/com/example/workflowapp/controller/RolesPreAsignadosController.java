package com.example.workflowapp.controller;

import com.example.workflowapp.model.RolesPreAsignados;
import com.example.workflowapp.service.RolesPreAsignadosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles-pre-asignados")
public class RolesPreAsignadosController {

	private final RolesPreAsignadosService rolesPreAsignadosService;

	public RolesPreAsignadosController(RolesPreAsignadosService rolesPreAsignadosService) {
		this.rolesPreAsignadosService = rolesPreAsignadosService;
	}

	@GetMapping
	public List<RolesPreAsignados> list(@RequestParam Integer activityId) {
		return rolesPreAsignadosService.getRolesPreAsignadosByActivityId(activityId);
	}
}
