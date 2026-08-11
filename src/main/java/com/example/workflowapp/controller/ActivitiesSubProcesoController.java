package com.example.workflowapp.controller;

import com.example.workflowapp.model.ActivitiesSubProceso;
import com.example.workflowapp.service.ActivitiesSubProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/activities-sub-proceso")
public class ActivitiesSubProcesoController {

	private final ActivitiesSubProcesoService activitiesSubProcesoService;

	public ActivitiesSubProcesoController(ActivitiesSubProcesoService activitiesSubProcesoService) {
		this.activitiesSubProcesoService = activitiesSubProcesoService;
	}

	@GetMapping
	public List<ActivitiesSubProceso> list(@RequestParam Integer activityId) {
		return activitiesSubProcesoService.getActivitiesSubProcesoByActivityId(activityId);
	}
}
