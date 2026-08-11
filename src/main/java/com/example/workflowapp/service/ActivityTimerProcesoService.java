package com.example.workflowapp.service;

import com.example.workflowapp.model.ActivityTimerProceso;
import com.example.workflowapp.repository.ActivityTimerProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityTimerProcesoService {

	private final ActivityTimerProcesoRepository repository;

	public ActivityTimerProcesoService(ActivityTimerProcesoRepository repository) {
		this.repository = repository;
	}

	public List<ActivityTimerProceso> getActivitiesTimerProcesoByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
