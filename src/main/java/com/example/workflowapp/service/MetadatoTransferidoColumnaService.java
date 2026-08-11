package com.example.workflowapp.service;

import com.example.workflowapp.model.MetadatoTransferidoColumna;
import com.example.workflowapp.repository.MetadatoTransferidoColumnaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadatoTransferidoColumnaService {

	private final MetadatoTransferidoColumnaRepository repository;

	public MetadatoTransferidoColumnaService(MetadatoTransferidoColumnaRepository repository) {
		this.repository = repository;
	}

	public List<MetadatoTransferidoColumna> getMetadatosTransferidoColumnaByActivityId(Integer activityId) {
		return repository.findByIdActividad(activityId);
	}
}
