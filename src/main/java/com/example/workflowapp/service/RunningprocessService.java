package com.example.workflowapp.service;

import com.example.workflowapp.model.Runningprocess;
import com.example.workflowapp.repository.RunningprocessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunningprocessService {

	private final RunningprocessRepository repository;

	public RunningprocessService(RunningprocessRepository repository) {
		this.repository = repository;
	}

	public List<Runningprocess> getRunningprocessesByProcessId(Integer processId) {
		return repository.findByProcessId(processId);
	}
}