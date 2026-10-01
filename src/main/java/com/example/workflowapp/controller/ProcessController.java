package com.example.workflowapp.controller;

import com.example.workflowapp.model.CrearProcesoRequest;
import com.example.workflowapp.model.ProcesoCreadoResponse;
import com.example.workflowapp.model.ProcessSummary;
import com.example.workflowapp.service.ProcesoCreadorService;
import com.example.workflowapp.service.ProcessService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/processes")
public class ProcessController {

	private final ProcessService processService;
	private final ProcesoCreadorService procesoCreadorService;

	public ProcessController(ProcessService processService, ProcesoCreadorService procesoCreadorService) {
		this.processService = processService;
		this.procesoCreadorService = procesoCreadorService;
	}

	@GetMapping
	public List<ProcessSummary> list() {
		return processService.getAllProcesses();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProcesoCreadoResponse crearProceso(@RequestBody CrearProcesoRequest request) {
		int processId = procesoCreadorService.crearProceso(request);
		return new ProcesoCreadoResponse(processId);
	}
}
