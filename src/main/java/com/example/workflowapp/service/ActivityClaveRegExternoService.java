package com.example.workflowapp.service;

import com.example.workflowapp.model.ActivityClaveRegExterno;
import com.example.workflowapp.repository.ActivityClaveRegExternoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityClaveRegExternoService {

	private final ActivityClaveRegExternoRepository repository;

	public ActivityClaveRegExternoService(ActivityClaveRegExternoRepository repository) {
		this.repository = repository;
	}

	public List<ActivityClaveRegExterno> getActivitiesClaveRegExternoByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
