package com.example.workflowapp.service;

import com.example.workflowapp.model.ReglaDeNegocio;
import com.example.workflowapp.repository.ReglaDeNegocioRepository;
import com.example.workflowapp.repository.TransitionReglaNegocioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReglaDeNegocioService {

	private final ReglaDeNegocioRepository reglaDeNegocioRepository;

	private final TransitionReglaNegocioRepository transitionReglaNegocioRepository;

	public ReglaDeNegocioService(ReglaDeNegocioRepository reglaDeNegocioRepository,
			TransitionReglaNegocioRepository transitionReglaNegocioRepository) {
		this.reglaDeNegocioRepository = reglaDeNegocioRepository;
		this.transitionReglaNegocioRepository = transitionReglaNegocioRepository;
	}

	public List<ReglaDeNegocio> getReglasDeNegocioByTransitionId(Integer transitionId) {
		List<Integer> ids = transitionReglaNegocioRepository.findByIdTransitionId(transitionId).stream()
				.map(juncion -> juncion.getId().getIdReglaNegocio())
				.toList();
		return reglaDeNegocioRepository.findAllById(ids);
	}
}