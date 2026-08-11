package com.example.workflowapp.controller;

import com.example.workflowapp.model.CondicionVisibilidadProceso;
import com.example.workflowapp.service.CondicionVisibilidadProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/condiciones-visibilidad-proceso")
public class CondicionVisibilidadProcesoController {

	private final CondicionVisibilidadProcesoService condicionVisibilidadProcesoService;

	public CondicionVisibilidadProcesoController(CondicionVisibilidadProcesoService condicionVisibilidadProcesoService) {
		this.condicionVisibilidadProcesoService = condicionVisibilidadProcesoService;
	}

	@GetMapping
	public List<CondicionVisibilidadProceso> list() {
		return condicionVisibilidadProcesoService.getAllCondicionesVisibilidadProceso();
	}
}
