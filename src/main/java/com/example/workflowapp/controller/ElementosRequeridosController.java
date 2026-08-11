package com.example.workflowapp.controller;

import com.example.workflowapp.model.ElementosRequeridos;
import com.example.workflowapp.service.ElementosRequeridosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/elementos-requeridos")
public class ElementosRequeridosController {

	private final ElementosRequeridosService elementosRequeridosService;

	public ElementosRequeridosController(ElementosRequeridosService elementosRequeridosService) {
		this.elementosRequeridosService = elementosRequeridosService;
	}

	@GetMapping
	public List<ElementosRequeridos> list(@RequestParam Integer activityId) {
		return elementosRequeridosService.getElementosRequeridosByActivityId(activityId);
	}
}
