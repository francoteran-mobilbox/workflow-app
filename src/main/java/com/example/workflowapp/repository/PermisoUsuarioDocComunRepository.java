package com.example.workflowapp.repository;

import com.example.workflowapp.model.PermisoUsuarioDocComun;
import com.example.workflowapp.model.PermisoUsuarioDocComunId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoUsuarioDocComunRepository extends JpaRepository<PermisoUsuarioDocComun, PermisoUsuarioDocComunId> {
}
