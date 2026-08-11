package com.example.workflowapp.repository;

import com.example.workflowapp.model.ActividadesPlanificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActividadesPlanificacionRepository extends JpaRepository<ActividadesPlanificacion, Integer> {

	List<ActividadesPlanificacion> findByProcessId(Integer processId);
}