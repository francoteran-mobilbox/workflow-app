package com.example.workflowapp.controller;

import com.example.workflowapp.model.ClaveRegistroExterno;
import com.example.workflowapp.service.ClaveRegistroExternoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/claves-registro-externo")
public class ClaveRegistroExternoController {

	private final ClaveRegistroExternoService claveRegistroExternoService;

	public ClaveRegistroExternoController(ClaveRegistroExternoService claveRegistroExternoService) {
		this.claveRegistroExternoService = claveRegistroExternoService;
	}

	@GetMapping
	public List<ClaveRegistroExterno> list() {
		return claveRegistroExternoService.getAllClavesRegistroExterno();
	}
}
