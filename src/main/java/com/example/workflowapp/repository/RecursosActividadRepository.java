package com.example.workflowapp.repository;

import com.example.workflowapp.model.RecursosActividad;
import com.example.workflowapp.model.RecursosActividadId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecursosActividadRepository extends JpaRepository<RecursosActividad, RecursosActividadId> {

	List<RecursosActividad> findByIdActivityId(Integer activityId);
}
