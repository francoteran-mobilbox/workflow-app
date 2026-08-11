package com.example.workflowapp.controller;

import com.example.workflowapp.model.ProcesoMecanismoDenominacion;
import com.example.workflowapp.service.ProcesoMecanismoDenominacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/procesos-mecanismo-denominacion")
public class ProcesoMecanismoDenominacionController {

	private final ProcesoMecanismoDenominacionService procesoMecanismoDenominacionService;

	public ProcesoMecanismoDenominacionController(ProcesoMecanismoDenominacionService procesoMecanismoDenominacionService) {
		this.procesoMecanismoDenominacionService = procesoMecanismoDenominacionService;
	}

	@GetMapping
	public List<ProcesoMecanismoDenominacion> list() {
		return procesoMecanismoDenominacionService.getAllProcesosMecanismoDenominacion();
	}
}
