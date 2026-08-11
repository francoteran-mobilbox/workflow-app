package com.example.workflowapp.service;

import com.example.workflowapp.model.MetadatoReqProceso;
import com.example.workflowapp.repository.MetadatoReqProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadatoReqProcesoService {

	private final MetadatoReqProcesoRepository repository;

	public MetadatoReqProcesoService(MetadatoReqProcesoRepository repository) {
		this.repository = repository;
	}

	public List<MetadatoReqProceso> getAllMetadatosReqProceso() {
		return repository.findAll();
	}
}
