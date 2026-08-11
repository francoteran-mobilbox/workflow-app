package com.example.workflowapp.service;

import com.example.workflowapp.model.DocumentoComunActividad;
import com.example.workflowapp.repository.DocumentoComunActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoComunActividadService {

	private final DocumentoComunActividadRepository repository;

	public DocumentoComunActividadService(DocumentoComunActividadRepository repository) {
		this.repository = repository;
	}

	public List<DocumentoComunActividad> getDocumentosComunActividadByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
