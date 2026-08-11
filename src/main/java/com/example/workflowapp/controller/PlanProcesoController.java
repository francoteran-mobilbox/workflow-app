package com.example.workflowapp.controller;

import com.example.workflowapp.model.PlanProceso;
import com.example.workflowapp.service.PlanProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/planes-proceso")
public class PlanProcesoController {

	private final PlanProcesoService planProcesoService;

	public PlanProcesoController(PlanProcesoService planProcesoService) {
		this.planProcesoService = planProcesoService;
	}

	@GetMapping
	public List<PlanProceso> list(@RequestParam Integer processId) {
		return planProcesoService.getPlanesProcesoByProcessId(processId);
	}
}