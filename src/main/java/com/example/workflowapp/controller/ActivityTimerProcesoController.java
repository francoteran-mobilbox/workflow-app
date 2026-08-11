package com.example.workflowapp.controller;

import com.example.workflowapp.model.ActivityTimerProceso;
import com.example.workflowapp.service.ActivityTimerProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/activities-timer-proceso")
public class ActivityTimerProcesoController {

	private final ActivityTimerProcesoService activityTimerProcesoService;

	public ActivityTimerProcesoController(ActivityTimerProcesoService activityTimerProcesoService) {
		this.activityTimerProcesoService = activityTimerProcesoService;
	}

	@GetMapping
	public List<ActivityTimerProceso> list(@RequestParam Integer activityId) {
		return activityTimerProcesoService.getActivitiesTimerProcesoByActivityId(activityId);
	}
}
