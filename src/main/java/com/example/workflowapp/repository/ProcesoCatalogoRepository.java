package com.example.workflowapp.repository;

import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.model.ProcesoCatalogoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcesoCatalogoRepository extends JpaRepository<ProcesoCatalogo, ProcesoCatalogoId> {

	List<ProcesoCatalogo> findByActivityId(Integer activityId);
}