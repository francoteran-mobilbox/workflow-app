package com.example.workflowapp.repository;

import com.example.workflowapp.model.TransitionTimerProceso;
import com.example.workflowapp.model.TransitionTimerProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransitionTimerProcesoRepository extends JpaRepository<TransitionTimerProceso, TransitionTimerProcesoId> {

	List<TransitionTimerProceso> findByIdTransitionId(Integer transitionId);
}