package com.example.workflowapp.controller;

import com.example.workflowapp.model.ReglaDocumentoMultiple;
import com.example.workflowapp.service.ReglaDocumentoMultipleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reglas-documento-multiple")
public class ReglaDocumentoMultipleController {

	private final ReglaDocumentoMultipleService reglaDocumentoMultipleService;

	public ReglaDocumentoMultipleController(ReglaDocumentoMultipleService reglaDocumentoMultipleService) {
		this.reglaDocumentoMultipleService = reglaDocumentoMultipleService;
	}

	@GetMapping
	public List<ReglaDocumentoMultiple> list(@RequestParam Integer activityId) {
		return reglaDocumentoMultipleService.getReglasDocumentoMultipleByActivityId(activityId);
	}
}
