package com.example.workflowapp.service;

import com.example.workflowapp.model.ActividadesPlanificacion;
import com.example.workflowapp.repository.ActividadesPlanificacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadesPlanificacionService {

	private final ActividadesPlanificacionRepository repository;

	public ActividadesPlanificacionService(ActividadesPlanificacionRepository repository) {
		this.repository = repository;
	}

	public List<ActividadesPlanificacion> getActividadesPlanificacionByProcessId(Integer processId) {
		return repository.findByProcessId(processId);
	}
}