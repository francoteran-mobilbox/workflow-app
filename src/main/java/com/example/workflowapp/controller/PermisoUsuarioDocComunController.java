package com.example.workflowapp.controller;

import com.example.workflowapp.model.PermisoUsuarioDocComun;
import com.example.workflowapp.service.PermisoUsuarioDocComunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-usuario-doc-comun")
public class PermisoUsuarioDocComunController {

	private final PermisoUsuarioDocComunService permisoUsuarioDocComunService;

	public PermisoUsuarioDocComunController(PermisoUsuarioDocComunService permisoUsuarioDocComunService) {
		this.permisoUsuarioDocComunService = permisoUsuarioDocComunService;
	}

	@GetMapping
	public List<PermisoUsuarioDocComun> list() {
		return permisoUsuarioDocComunService.getAllPermisosUsuarioDocComun();
	}
}
