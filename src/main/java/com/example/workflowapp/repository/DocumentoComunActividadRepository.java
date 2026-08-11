package com.example.workflowapp.repository;

import com.example.workflowapp.model.DocumentoComunActividad;
import com.example.workflowapp.model.DocumentoComunActividadId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentoComunActividadRepository extends JpaRepository<DocumentoComunActividad, DocumentoComunActividadId> {

	List<DocumentoComunActividad> findByIdActivityId(Integer activityId);
}
