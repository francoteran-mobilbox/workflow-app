package com.example.workflowapp.controller;

import com.example.workflowapp.model.GrillaMetadatoDocumento;
import com.example.workflowapp.service.GrillaMetadatoDocumentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grillas-metadato-documento")
public class GrillaMetadatoDocumentoController {

	private final GrillaMetadatoDocumentoService grillaMetadatoDocumentoService;

	public GrillaMetadatoDocumentoController(GrillaMetadatoDocumentoService grillaMetadatoDocumentoService) {
		this.grillaMetadatoDocumentoService = grillaMetadatoDocumentoService;
	}

	@GetMapping
	public List<GrillaMetadatoDocumento> list(@RequestParam Integer idDocumento) {
		return grillaMetadatoDocumentoService.getGrillaMetadatoDocumentoByIdDocumento(idDocumento);
	}
}