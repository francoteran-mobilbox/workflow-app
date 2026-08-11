package com.example.workflowapp.service;

import com.example.workflowapp.model.Activity;
import com.example.workflowapp.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

	private final ActivityRepository repository;

	public ActivityService(ActivityRepository repository) {
		this.repository = repository;
	}

	public List<Activity> getActivitiesByProcessId(Integer processId) {
		return repository.findByProcessId(processId);
	}
}
