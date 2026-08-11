package com.example.workflowapp.controller;

import com.example.workflowapp.model.TransitionReglaNegocio;
import com.example.workflowapp.service.TransitionReglaNegocioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transitions-regla-negocio")
public class TransitionReglaNegocioController {

	private final TransitionReglaNegocioService transitionReglaNegocioService;

	public TransitionReglaNegocioController(TransitionReglaNegocioService transitionReglaNegocioService) {
		this.transitionReglaNegocioService = transitionReglaNegocioService;
	}

	@GetMapping
	public List<TransitionReglaNegocio> list(@RequestParam Integer transitionId) {
		return transitionReglaNegocioService.getTransitionsReglaNegocioByTransitionId(transitionId);
	}
}