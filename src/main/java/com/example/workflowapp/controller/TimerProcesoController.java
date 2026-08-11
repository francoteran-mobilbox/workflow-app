package com.example.workflowapp.controller;

import com.example.workflowapp.model.TimerProceso;
import com.example.workflowapp.service.TimerProcesoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/timers-proceso")
public class TimerProcesoController {

	private final TimerProcesoService timerProcesoService;

	public TimerProcesoController(TimerProcesoService timerProcesoService) {
		this.timerProcesoService = timerProcesoService;
	}

	@GetMapping
	public List<TimerProceso> list() {
		return timerProcesoService.getAllTimersProceso();
	}
}
