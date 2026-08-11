package com.example.workflowapp.controller;

import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.service.MetaDisponiblesActividadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meta-disponibles-actividad")
public class MetaDisponiblesActividadController {

	private final MetaDisponiblesActividadService metaDisponiblesActividadService;

	public MetaDisponiblesActividadController(MetaDisponiblesActividadService metaDisponiblesActividadService) {
		this.metaDisponiblesActividadService = metaDisponiblesActividadService;
	}

	@GetMapping
	public List<MetaDisponiblesActividad> list(@RequestParam Integer activityId) {
		return metaDisponiblesActividadService.getMetaDisponiblesActividadByActivityId(activityId);
	}
}
