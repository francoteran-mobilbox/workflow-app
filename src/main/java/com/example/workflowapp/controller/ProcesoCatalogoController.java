package com.example.workflowapp.controller;

import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.service.ProcesoCatalogoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/procesos-catalogo")
public class ProcesoCatalogoController {

	private final ProcesoCatalogoService procesoCatalogoService;

	public ProcesoCatalogoController(ProcesoCatalogoService procesoCatalogoService) {
		this.procesoCatalogoService = procesoCatalogoService;
	}

	@GetMapping
	public List<ProcesoCatalogo> list(@RequestParam Integer activityId) {
		return procesoCatalogoService.getProcesosCatalogoByActivityId(activityId);
	}
}