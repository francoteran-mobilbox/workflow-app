package com.example.workflowapp.repository;

import com.example.workflowapp.model.PermisoProcesoCondicion;
import com.example.workflowapp.model.PermisoProcesoCondicionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoProcesoCondicionRepository extends JpaRepository<PermisoProcesoCondicion, PermisoProcesoCondicionId> {
}
