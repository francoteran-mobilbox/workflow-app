package com.example.workflowapp.service;

import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.repository.ProcesoCatalogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesoCatalogoService {

	private final ProcesoCatalogoRepository repository;

	public ProcesoCatalogoService(ProcesoCatalogoRepository repository) {
		this.repository = repository;
	}

	public List<ProcesoCatalogo> getProcesosCatalogoByActivityId(Integer activityId) {
		return repository.findByActivityId(activityId);
	}
}