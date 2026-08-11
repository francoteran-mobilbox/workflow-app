package com.example.workflowapp.service;

import com.example.workflowapp.model.ActivitiesSubProceso;
import com.example.workflowapp.repository.ActivitiesSubProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivitiesSubProcesoService {

	private final ActivitiesSubProcesoRepository repository;

	public ActivitiesSubProcesoService(ActivitiesSubProcesoRepository repository) {
		this.repository = repository;
	}

	public List<ActivitiesSubProceso> getActivitiesSubProcesoByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
