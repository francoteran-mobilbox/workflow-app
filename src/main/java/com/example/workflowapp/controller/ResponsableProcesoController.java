package com.example.workflowapp.controller;

import com.example.workflowapp.model.ResponsableProceso;
import com.example.workflowapp.service.ResponsableProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/responsables-proceso")
public class ResponsableProcesoController {

	private final ResponsableProcesoService responsableProcesoService;

	public ResponsableProcesoController(ResponsableProcesoService responsableProcesoService) {
		this.responsableProcesoService = responsableProcesoService;
	}

	@GetMapping
	public List<ResponsableProceso> list() {
		return responsableProcesoService.getAllResponsablesProceso();
	}
}
