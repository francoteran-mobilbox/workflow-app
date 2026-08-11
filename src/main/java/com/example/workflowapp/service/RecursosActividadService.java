package com.example.workflowapp.service;

import com.example.workflowapp.model.RecursosActividad;
import com.example.workflowapp.repository.RecursosActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursosActividadService {

	private final RecursosActividadRepository repository;

	public RecursosActividadService(RecursosActividadRepository repository) {
		this.repository = repository;
	}

	public List<RecursosActividad> getRecursosActividadByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
