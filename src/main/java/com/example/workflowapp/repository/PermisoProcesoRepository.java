package com.example.workflowapp.repository;

import com.example.workflowapp.model.PermisoProceso;
import com.example.workflowapp.model.PermisoProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoProcesoRepository extends JpaRepository<PermisoProceso, PermisoProcesoId> {
}
