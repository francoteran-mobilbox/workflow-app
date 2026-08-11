package com.example.workflowapp.service;

import com.example.workflowapp.model.TimerProceso;
import com.example.workflowapp.repository.TimerProcesoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimerProcesoService {

	private final TimerProcesoRepository repository;

	public TimerProcesoService(TimerProcesoRepository repository) {
		this.repository = repository;
	}

	public List<TimerProceso> getAllTimersProceso() {
		return repository.findAll();
	}
}
