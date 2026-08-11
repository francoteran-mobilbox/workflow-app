package com.example.workflowapp.repository;

import com.example.workflowapp.model.TransitionReglaUsuario;
import com.example.workflowapp.model.TransitionReglaUsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransitionReglaUsuarioRepository extends JpaRepository<TransitionReglaUsuario, TransitionReglaUsuarioId> {

	List<TransitionReglaUsuario> findByIdTransitionId(Integer transitionId);
}