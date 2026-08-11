package com.example.workflowapp.service;

import com.example.workflowapp.model.DatoReqProceso;
import com.example.workflowapp.repository.DatoReqProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatoReqProcesoService {

	private final DatoReqProcesoRepository repository;

	public DatoReqProcesoService(DatoReqProcesoRepository repository) {
		this.repository = repository;
	}

	public List<DatoReqProceso> getAllDatosReqProceso() {
		return repository.findAll();
	}
}
