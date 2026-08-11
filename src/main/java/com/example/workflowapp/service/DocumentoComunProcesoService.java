package com.example.workflowapp.service;

import com.example.workflowapp.model.DocumentoComunProceso;
import com.example.workflowapp.repository.DocumentoComunProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoComunProcesoService {

	private final DocumentoComunProcesoRepository repository;

	public DocumentoComunProcesoService(DocumentoComunProcesoRepository repository) {
		this.repository = repository;
	}

	public List<DocumentoComunProceso> getAllDocumentosComunesProceso() {
		return repository.findAll();
	}
}
