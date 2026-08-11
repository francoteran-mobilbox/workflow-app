package com.example.workflowapp.service;

import com.example.workflowapp.model.ColumnaTransferida;
import com.example.workflowapp.repository.ColumnaTransferidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColumnaTransferidaService {

	private final ColumnaTransferidaRepository repository;

	public ColumnaTransferidaService(ColumnaTransferidaRepository repository) {
		this.repository = repository;
	}

	public List<ColumnaTransferida> getColumnasTransferidaByActivityId(Integer activityId) {
		return repository.findByIdActividad(activityId);
	}
}
