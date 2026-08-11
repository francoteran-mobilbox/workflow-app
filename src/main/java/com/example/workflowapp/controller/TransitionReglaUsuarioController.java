package com.example.workflowapp.controller;

import com.example.workflowapp.model.TransitionReglaUsuario;
import com.example.workflowapp.service.TransitionReglaUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transitions-regla-usuario")
public class TransitionReglaUsuarioController {

	private final TransitionReglaUsuarioService transitionReglaUsuarioService;

	public TransitionReglaUsuarioController(TransitionReglaUsuarioService transitionReglaUsuarioService) {
		this.transitionReglaUsuarioService = transitionReglaUsuarioService;
	}

	@GetMapping
	public List<TransitionReglaUsuario> list(@RequestParam Integer transitionId) {
		return transitionReglaUsuarioService.getTransitionsReglaUsuarioByTransitionId(transitionId);
	}
}