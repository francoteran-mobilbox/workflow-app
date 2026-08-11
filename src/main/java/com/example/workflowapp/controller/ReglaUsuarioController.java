package com.example.workflowapp.controller;

import com.example.workflowapp.model.ReglaUsuario;
import com.example.workflowapp.service.ReglaUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reglas-usuario")
public class ReglaUsuarioController {

	private final ReglaUsuarioService reglaUsuarioService;

	public ReglaUsuarioController(ReglaUsuarioService reglaUsuarioService) {
		this.reglaUsuarioService = reglaUsuarioService;
	}

	@GetMapping
	public List<ReglaUsuario> list(@RequestParam Integer transitionId) {
		return reglaUsuarioService.getReglasUsuarioByTransitionId(transitionId);
	}
}