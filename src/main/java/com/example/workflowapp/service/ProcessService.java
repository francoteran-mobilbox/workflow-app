package com.example.workflowapp.service;

import com.example.workflowapp.model.ProcessSummary;
import com.example.workflowapp.repository.ProcessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessService {

	private final ProcessRepository repository;

	public ProcessService(ProcessRepository repository) {
		this.repository = repository;
	}

	public List<ProcessSummary> getAllProcesses() {
		return repository.findByEsUltimaVersionTrue();
	}
}
