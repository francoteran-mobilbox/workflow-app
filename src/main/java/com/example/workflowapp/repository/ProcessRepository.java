package com.example.workflowapp.repository;

import com.example.workflowapp.model.ProcessSummary;
import com.example.workflowapp.model.WorkflowProcess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcessRepository extends JpaRepository<WorkflowProcess, Integer> {

	List<ProcessSummary> findByEsUltimaVersionTrue();

	boolean existsByProcessName(String processName);
}
