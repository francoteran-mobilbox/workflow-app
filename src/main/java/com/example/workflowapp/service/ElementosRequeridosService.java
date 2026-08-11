package com.example.workflowapp.service;

import com.example.workflowapp.model.ElementosRequeridos;
import com.example.workflowapp.repository.ElementosRequeridosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementosRequeridosService {

	private final ElementosRequeridosRepository repository;

	public ElementosRequeridosService(ElementosRequeridosRepository repository) {
		this.repository = repository;
	}

	public List<ElementosRequeridos> getElementosRequeridosByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
