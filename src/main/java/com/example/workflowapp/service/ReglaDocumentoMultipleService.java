package com.example.workflowapp.service;

import com.example.workflowapp.model.ReglaDocumentoMultiple;
import com.example.workflowapp.repository.ReglaDocumentoMultipleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReglaDocumentoMultipleService {

	private final ReglaDocumentoMultipleRepository repository;

	public ReglaDocumentoMultipleService(ReglaDocumentoMultipleRepository repository) {
		this.repository = repository;
	}

	public List<ReglaDocumentoMultiple> getReglasDocumentoMultipleByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
