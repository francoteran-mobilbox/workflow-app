package com.example.workflowapp.controller;

import com.example.workflowapp.model.ProcessSummary;
import com.example.workflowapp.service.ProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/processes")
public class ProcessController {

	private final ProcessService processService;

	public ProcessController(ProcessService processService) {
		this.processService = processService;
	}

	@GetMapping
	public List<ProcessSummary> list() {
		return processService.getAllProcesses();
	}
}
