package com.example.workflowapp.controller;

import com.example.workflowapp.model.MetadatoTransferidoActividad;
import com.example.workflowapp.service.MetadatoTransferidoActividadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/metadatos-transferido-actividad")
public class MetadatoTransferidoActividadController {

	private final MetadatoTransferidoActividadService metadatoTransferidoActividadService;

	public MetadatoTransferidoActividadController(MetadatoTransferidoActividadService metadatoTransferidoActividadService) {
		this.metadatoTransferidoActividadService = metadatoTransferidoActividadService;
	}

	@GetMapping
	public List<MetadatoTransferidoActividad> list(@RequestParam Integer activityId) {
		return metadatoTransferidoActividadService.getMetadatosTransferidoActividadByActivityId(activityId);
	}
}
