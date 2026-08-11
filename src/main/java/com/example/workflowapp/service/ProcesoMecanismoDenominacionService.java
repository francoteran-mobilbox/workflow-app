package com.example.workflowapp.service;

import com.example.workflowapp.model.ProcesoMecanismoDenominacion;
import com.example.workflowapp.repository.ProcesoMecanismoDenominacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesoMecanismoDenominacionService {

	private final ProcesoMecanismoDenominacionRepository repository;

	public ProcesoMecanismoDenominacionService(ProcesoMecanismoDenominacionRepository repository) {
		this.repository = repository;
	}

	public List<ProcesoMecanismoDenominacion> getAllProcesosMecanismoDenominacion() {
		return repository.findAll();
	}
}
