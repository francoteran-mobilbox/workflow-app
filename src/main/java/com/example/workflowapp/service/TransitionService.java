package com.example.workflowapp.service;

import com.example.workflowapp.model.Transition;
import com.example.workflowapp.repository.TransitionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitionService {

	private final TransitionRepository repository;

	public TransitionService(TransitionRepository repository) {
		this.repository = repository;
	}

	public List<Transition> getTransitionsByProcessId(Integer processId) {
		return repository.findByProcessId(processId);
	}
}