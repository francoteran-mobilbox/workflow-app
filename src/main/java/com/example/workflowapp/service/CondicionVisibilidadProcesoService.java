package com.example.workflowapp.service;

import com.example.workflowapp.model.CondicionVisibilidadProceso;
import com.example.workflowapp.repository.CondicionVisibilidadProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondicionVisibilidadProcesoService {

	private final CondicionVisibilidadProcesoRepository repository;

	public CondicionVisibilidadProcesoService(CondicionVisibilidadProcesoRepository repository) {
		this.repository = repository;
	}

	public List<CondicionVisibilidadProceso> getAllCondicionesVisibilidadProceso() {
		return repository.findAll();
	}
}
