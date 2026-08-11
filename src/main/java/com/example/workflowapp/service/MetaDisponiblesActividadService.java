package com.example.workflowapp.service;

import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.repository.MetaDisponiblesActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaDisponiblesActividadService {

	private final MetaDisponiblesActividadRepository repository;

	public MetaDisponiblesActividadService(MetaDisponiblesActividadRepository repository) {
		this.repository = repository;
	}

	public List<MetaDisponiblesActividad> getMetaDisponiblesActividadByActivityId(Integer activityId) {
		return repository.findByIdActivityId(activityId);
	}
}
