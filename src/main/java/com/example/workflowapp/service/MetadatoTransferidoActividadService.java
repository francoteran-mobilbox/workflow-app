package com.example.workflowapp.service;

import com.example.workflowapp.model.MetadatoTransferidoActividad;
import com.example.workflowapp.repository.MetadatoTransferidoActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadatoTransferidoActividadService {

	private final MetadatoTransferidoActividadRepository repository;

	public MetadatoTransferidoActividadService(MetadatoTransferidoActividadRepository repository) {
		this.repository = repository;
	}

	public List<MetadatoTransferidoActividad> getMetadatosTransferidoActividadByActivityId(Integer activityId) {
		return repository.findByActivityId(activityId);
	}
}
