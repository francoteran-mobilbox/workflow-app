package com.example.workflowapp.controller;

import com.example.workflowapp.model.Transition;
import com.example.workflowapp.service.TransitionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transitions")
public class TransitionController {

	private final TransitionService transitionService;

	public TransitionController(TransitionService transitionService) {
		this.transitionService = transitionService;
	}

	@GetMapping
	public List<Transition> list(@RequestParam Integer processId) {
		return transitionService.getTransitionsByProcessId(processId);
	}
}