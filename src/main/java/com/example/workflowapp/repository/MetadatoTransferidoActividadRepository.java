package com.example.workflowapp.repository;

import com.example.workflowapp.model.MetadatoTransferidoActividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadatoTransferidoActividadRepository extends JpaRepository<MetadatoTransferidoActividad, Integer> {

	List<MetadatoTransferidoActividad> findByActivityId(Integer activityId);
}
