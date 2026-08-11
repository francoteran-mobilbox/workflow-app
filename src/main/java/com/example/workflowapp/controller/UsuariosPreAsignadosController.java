package com.example.workflowapp.controller;

import com.example.workflowapp.model.UsuariosPreAsignados;
import com.example.workflowapp.service.UsuariosPreAsignadosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios-pre-asignados")
public class UsuariosPreAsignadosController {

	private final UsuariosPreAsignadosService usuariosPreAsignadosService;

	public UsuariosPreAsignadosController(UsuariosPreAsignadosService usuariosPreAsignadosService) {
		this.usuariosPreAsignadosService = usuariosPreAsignadosService;
	}

	@GetMapping
	public List<UsuariosPreAsignados> list(@RequestParam Integer activityId) {
		return usuariosPreAsignadosService.getUsuariosPreAsignadosByActivityId(activityId);
	}
}
