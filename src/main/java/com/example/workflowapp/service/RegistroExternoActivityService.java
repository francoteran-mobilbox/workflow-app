package com.example.workflowapp.service;

import com.example.workflowapp.model.RegistroExternoActivity;
import com.example.workflowapp.repository.RegistroExternoActivityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistroExternoActivityService {

	private final RegistroExternoActivityRepository repository;

	public RegistroExternoActivityService(RegistroExternoActivityRepository repository) {
		this.repository = repository;
	}

	public Optional<RegistroExternoActivity> getRegistroExternoActivityByActivityId(Integer activityId) {
		return repository.findById(activityId);
	}
}
