package com.example.workflowapp.controller;

import com.example.workflowapp.model.DatoReqProceso;
import com.example.workflowapp.service.DatoReqProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/datos-req-proceso")
public class DatoReqProcesoController {

	private final DatoReqProcesoService datoReqProcesoService;

	public DatoReqProcesoController(DatoReqProcesoService datoReqProcesoService) {
		this.datoReqProcesoService = datoReqProcesoService;
	}

	@GetMapping
	public List<DatoReqProceso> list() {
		return datoReqProcesoService.getAllDatosReqProceso();
	}
}
