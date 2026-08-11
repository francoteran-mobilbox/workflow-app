package com.example.workflowapp.controller;

import com.example.workflowapp.model.TransitionTimerProceso;
import com.example.workflowapp.service.TransitionTimerProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transitions-timer-proceso")
public class TransitionTimerProcesoController {

	private final TransitionTimerProcesoService transitionTimerProcesoService;

	public TransitionTimerProcesoController(TransitionTimerProcesoService transitionTimerProcesoService) {
		this.transitionTimerProcesoService = transitionTimerProcesoService;
	}

	@GetMapping
	public List<TransitionTimerProceso> list(@RequestParam Integer transitionId) {
		return transitionTimerProcesoService.getTransitionsTimerProcesoByTransitionId(transitionId);
	}
}