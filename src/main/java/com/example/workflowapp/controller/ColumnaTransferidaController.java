package com.example.workflowapp.controller;

import com.example.workflowapp.model.ColumnaTransferida;
import com.example.workflowapp.service.ColumnaTransferidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/columnas-transferida")
public class ColumnaTransferidaController {

	private final ColumnaTransferidaService columnaTransferidaService;

	public ColumnaTransferidaController(ColumnaTransferidaService columnaTransferidaService) {
		this.columnaTransferidaService = columnaTransferidaService;
	}

	@GetMapping
	public List<ColumnaTransferida> list(@RequestParam Integer activityId) {
		return columnaTransferidaService.getColumnasTransferidaByActivityId(activityId);
	}
}
