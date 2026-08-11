package com.example.workflowapp.repository;

import com.example.workflowapp.model.PermisoRolProceso;
import com.example.workflowapp.model.PermisoRolProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoRolProcesoRepository extends JpaRepository<PermisoRolProceso, PermisoRolProcesoId> {
}
