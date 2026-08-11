package com.example.workflowapp.controller;

import com.example.workflowapp.model.ReglaDeNegocio;
import com.example.workflowapp.service.ReglaDeNegocioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reglas-de-negocio")
public class ReglaDeNegocioController {

	private final ReglaDeNegocioService reglaDeNegocioService;

	public ReglaDeNegocioController(ReglaDeNegocioService reglaDeNegocioService) {
		this.reglaDeNegocioService = reglaDeNegocioService;
	}

	@GetMapping
	public List<ReglaDeNegocio> list(@RequestParam Integer transitionId) {
		return reglaDeNegocioService.getReglasDeNegocioByTransitionId(transitionId);
	}
}