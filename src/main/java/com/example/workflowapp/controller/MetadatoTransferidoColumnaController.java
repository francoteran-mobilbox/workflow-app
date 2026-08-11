package com.example.workflowapp.controller;

import com.example.workflowapp.model.MetadatoTransferidoColumna;
import com.example.workflowapp.service.MetadatoTransferidoColumnaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/metadatos-transferido-columna")
public class MetadatoTransferidoColumnaController {

	private final MetadatoTransferidoColumnaService metadatoTransferidoColumnaService;

	public MetadatoTransferidoColumnaController(MetadatoTransferidoColumnaService metadatoTransferidoColumnaService) {
		this.metadatoTransferidoColumnaService = metadatoTransferidoColumnaService;
	}

	@GetMapping
	public List<MetadatoTransferidoColumna> list(@RequestParam Integer activityId) {
		return metadatoTransferidoColumnaService.getMetadatosTransferidoColumnaByActivityId(activityId);
	}
}
