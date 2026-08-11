package com.example.workflowapp.controller;

import com.example.workflowapp.model.MetadatoReqProceso;
import com.example.workflowapp.service.MetadatoReqProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/metadatos-req-proceso")
public class MetadatoReqProcesoController {

	private final MetadatoReqProcesoService metadatoReqProcesoService;

	public MetadatoReqProcesoController(MetadatoReqProcesoService metadatoReqProcesoService) {
		this.metadatoReqProcesoService = metadatoReqProcesoService;
	}

	@GetMapping
	public List<MetadatoReqProceso> list() {
		return metadatoReqProcesoService.getAllMetadatosReqProceso();
	}
}
