package com.example.workflowapp.controller;

import com.example.workflowapp.model.ActividadesPlanificacion;
import com.example.workflowapp.service.ActividadesPlanificacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actividades-planificacion")
public class ActividadesPlanificacionController {

	private final ActividadesPlanificacionService actividadesPlanificacionService;

	public ActividadesPlanificacionController(ActividadesPlanificacionService actividadesPlanificacionService) {
		this.actividadesPlanificacionService = actividadesPlanificacionService;
	}

	@GetMapping
	public List<ActividadesPlanificacion> list(@RequestParam Integer processId) {
		return actividadesPlanificacionService.getActividadesPlanificacionByProcessId(processId);
	}
}