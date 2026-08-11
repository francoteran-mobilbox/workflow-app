package com.example.workflowapp.controller;

import com.example.workflowapp.model.Runningprocess;
import com.example.workflowapp.service.RunningprocessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/runningprocesses")
public class RunningprocessController {

	private final RunningprocessService runningprocessService;

	public RunningprocessController(RunningprocessService runningprocessService) {
		this.runningprocessService = runningprocessService;
	}

	@GetMapping
	public List<Runningprocess> list(@RequestParam Integer processId) {
		return runningprocessService.getRunningprocessesByProcessId(processId);
	}
}