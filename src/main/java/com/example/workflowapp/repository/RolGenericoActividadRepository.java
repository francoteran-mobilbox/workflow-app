package com.example.workflowapp.repository;

import com.example.workflowapp.model.RolGenericoActividad;
import com.example.workflowapp.model.RolGenericoActividadId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolGenericoActividadRepository extends JpaRepository<RolGenericoActividad, RolGenericoActividadId> {
}
