package com.example.workflowapp.service;

import com.example.workflowapp.model.GrillaMetadatoDocumento;
import com.example.workflowapp.repository.GrillaMetadatoDocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrillaMetadatoDocumentoService {

	private final GrillaMetadatoDocumentoRepository repository;

	public GrillaMetadatoDocumentoService(GrillaMetadatoDocumentoRepository repository) {
		this.repository = repository;
	}

	public List<GrillaMetadatoDocumento> getGrillaMetadatoDocumentoByIdDocumento(Integer idDocumento) {
		return repository.findByidDocumento(idDocumento);
	}
}