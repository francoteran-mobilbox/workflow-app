package com.example.workflowapp.service;

import com.example.workflowapp.model.ReglaUsuario;
import com.example.workflowapp.repository.ReglaUsuarioRepository;
import com.example.workflowapp.repository.TransitionReglaUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReglaUsuarioService {

	private final ReglaUsuarioRepository reglaUsuarioRepository;

	private final TransitionReglaUsuarioRepository transitionReglaUsuarioRepository;

	public ReglaUsuarioService(ReglaUsuarioRepository reglaUsuarioRepository,
			TransitionReglaUsuarioRepository transitionReglaUsuarioRepository) {
		this.reglaUsuarioRepository = reglaUsuarioRepository;
		this.transitionReglaUsuarioRepository = transitionReglaUsuarioRepository;
	}

	public List<ReglaUsuario> getReglasUsuarioByTransitionId(Integer transitionId) {
		List<Integer> ids = transitionReglaUsuarioRepository.findByIdTransitionId(transitionId).stream()
				.map(juncion -> juncion.getId().getIdReglaUsuario())
				.toList();
		return reglaUsuarioRepository.findAllById(ids);
	}
}