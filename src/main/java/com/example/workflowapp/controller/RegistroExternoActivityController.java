package com.example.workflowapp.controller;

import com.example.workflowapp.model.RegistroExternoActivity;
import com.example.workflowapp.service.RegistroExternoActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/registros-externo-activity")
public class RegistroExternoActivityController {

	private final RegistroExternoActivityService registroExternoActivityService;

	public RegistroExternoActivityController(RegistroExternoActivityService registroExternoActivityService) {
		this.registroExternoActivityService = registroExternoActivityService;
	}

	@GetMapping
	public Optional<RegistroExternoActivity> list(@RequestParam Integer activityId) {
		return registroExternoActivityService.getRegistroExternoActivityByActivityId(activityId);
	}
}
