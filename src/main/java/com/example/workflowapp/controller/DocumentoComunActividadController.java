package com.example.workflowapp.controller;

import com.example.workflowapp.model.DocumentoComunActividad;
import com.example.workflowapp.service.DocumentoComunActividadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documentos-comun-actividad")
public class DocumentoComunActividadController {

	private final DocumentoComunActividadService documentoComunActividadService;

	public DocumentoComunActividadController(DocumentoComunActividadService documentoComunActividadService) {
		this.documentoComunActividadService = documentoComunActividadService;
	}

	@GetMapping
	public List<DocumentoComunActividad> list(@RequestParam Integer activityId) {
		return documentoComunActividadService.getDocumentosComunActividadByActivityId(activityId);
	}
}
