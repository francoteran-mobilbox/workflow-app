package com.example.workflowapp.repository;

import com.example.workflowapp.model.TransitionReglaNegocio;
import com.example.workflowapp.model.TransitionReglaNegocioId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransitionReglaNegocioRepository extends JpaRepository<TransitionReglaNegocio, TransitionReglaNegocioId> {

	List<TransitionReglaNegocio> findByIdTransitionId(Integer transitionId);
}