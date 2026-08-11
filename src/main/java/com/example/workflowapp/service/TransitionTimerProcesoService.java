package com.example.workflowapp.service;

import com.example.workflowapp.model.TransitionTimerProceso;
import com.example.workflowapp.repository.TransitionTimerProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitionTimerProcesoService {

	private final TransitionTimerProcesoRepository repository;

	public TransitionTimerProcesoService(TransitionTimerProcesoRepository repository) {
		this.repository = repository;
	}

	public List<TransitionTimerProceso> getTransitionsTimerProcesoByTransitionId(Integer transitionId) {
		return repository.findByIdTransitionId(transitionId);
	}
}