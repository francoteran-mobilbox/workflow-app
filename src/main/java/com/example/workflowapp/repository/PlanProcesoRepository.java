package com.example.workflowapp.repository;

import com.example.workflowapp.model.PlanProceso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanProcesoRepository extends JpaRepository<PlanProceso, Integer> {

	List<PlanProceso> findByProcessId(Integer processId);
}