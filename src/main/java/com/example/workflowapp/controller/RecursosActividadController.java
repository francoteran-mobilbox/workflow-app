package com.example.workflowapp.controller;

import com.example.workflowapp.model.RecursosActividad;
import com.example.workflowapp.service.RecursosActividadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recursos-actividad")
public class RecursosActividadController {

	private final RecursosActividadService recursosActividadService;

	public RecursosActividadController(RecursosActividadService recursosActividadService) {
		this.recursosActividadService = recursosActividadService;
	}

	@GetMapping
	public List<RecursosActividad> list(@RequestParam Integer activityId) {
		return recursosActividadService.getRecursosActividadByActivityId(activityId);
	}
}
