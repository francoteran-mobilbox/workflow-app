package com.example.workflowapp.controller;

import com.example.workflowapp.model.ActivityClaveRegExterno;
import com.example.workflowapp.service.ActivityClaveRegExternoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/activities-clave-reg-externo")
public class ActivityClaveRegExternoController {

	private final ActivityClaveRegExternoService activityClaveRegExternoService;

	public ActivityClaveRegExternoController(ActivityClaveRegExternoService activityClaveRegExternoService) {
		this.activityClaveRegExternoService = activityClaveRegExternoService;
	}

	@GetMapping
	public List<ActivityClaveRegExterno> list(@RequestParam Integer activityId) {
		return activityClaveRegExternoService.getActivitiesClaveRegExternoByActivityId(activityId);
	}
}
