package com.example.workflowapp.repository;

import com.example.workflowapp.model.RolGenericoProceso;
import com.example.workflowapp.model.RolGenericoProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolGenericoProcesoRepository extends JpaRepository<RolGenericoProceso, RolGenericoProcesoId> {
}
