package com.example.workflowapp.service;

import com.example.workflowapp.model.TransitionReglaUsuario;
import com.example.workflowapp.repository.TransitionReglaUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitionReglaUsuarioService {

	private final TransitionReglaUsuarioRepository repository;

	public TransitionReglaUsuarioService(TransitionReglaUsuarioRepository repository) {
		this.repository = repository;
	}

	public List<TransitionReglaUsuario> getTransitionsReglaUsuarioByTransitionId(Integer transitionId) {
		return repository.findByIdTransitionId(transitionId);
	}
}