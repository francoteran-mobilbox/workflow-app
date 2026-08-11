package com.example.workflowapp.service;

import com.example.workflowapp.model.PlanProceso;
import com.example.workflowapp.repository.PlanProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanProcesoService {

	private final PlanProcesoRepository repository;

	public PlanProcesoService(PlanProcesoRepository repository) {
		this.repository = repository;
	}

	public List<PlanProceso> getPlanesProcesoByProcessId(Integer processId) {
		return repository.findByProcessId(processId);
	}
}