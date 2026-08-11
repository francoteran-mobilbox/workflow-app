package com.example.workflowapp.controller;

import com.example.workflowapp.model.DocumentoComunProceso;
import com.example.workflowapp.service.DocumentoComunProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documentos-comun-proceso")
public class DocumentoComunProcesoController {

	private final DocumentoComunProcesoService documentoComunProcesoService;

	public DocumentoComunProcesoController(DocumentoComunProcesoService documentoComunProcesoService) {
		this.documentoComunProcesoService = documentoComunProcesoService;
	}

	@GetMapping
	public List<DocumentoComunProceso> list() {
		return documentoComunProcesoService.getAllDocumentosComunesProceso();
	}
}
