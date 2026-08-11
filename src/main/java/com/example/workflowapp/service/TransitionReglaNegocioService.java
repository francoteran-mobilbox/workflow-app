package com.example.workflowapp.service;

import com.example.workflowapp.model.TransitionReglaNegocio;
import com.example.workflowapp.repository.TransitionReglaNegocioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitionReglaNegocioService {

	private final TransitionReglaNegocioRepository repository;

	public TransitionReglaNegocioService(TransitionReglaNegocioRepository repository) {
		this.repository = repository;
	}

	public List<TransitionReglaNegocio> getTransitionsReglaNegocioByTransitionId(Integer transitionId) {
		return repository.findByIdTransitionId(transitionId);
	}
}