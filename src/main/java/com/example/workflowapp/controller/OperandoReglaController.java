package com.example.workflowapp.controller;

import com.example.workflowapp.model.OperandoReglaResponse;
import com.example.workflowapp.service.OperandoReglaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operandos-regla")
public class OperandoReglaController {

	private final OperandoReglaService operandoReglaService;

	public OperandoReglaController(OperandoReglaService operandoReglaService) {
		this.operandoReglaService = operandoReglaService;
	}

	@GetMapping("/{id}")
	public OperandoReglaResponse get(@PathVariable Integer id) {
		return operandoReglaService.getOperandoReglaConDetalle(id);
	}
}