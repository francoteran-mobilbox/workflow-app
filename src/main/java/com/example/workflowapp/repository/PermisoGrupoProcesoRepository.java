package com.example.workflowapp.repository;

import com.example.workflowapp.model.PermisoGrupoProceso;
import com.example.workflowapp.model.PermisoGrupoProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoGrupoProcesoRepository extends JpaRepository<PermisoGrupoProceso, PermisoGrupoProcesoId> {
}
