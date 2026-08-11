package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_rol_proceso")
public class PermisoRolProceso {

	@EmbeddedId
	private PermisoRolProcesoId id;

	public PermisoRolProceso() {
	}

	public PermisoRolProcesoId getId() {
		return id;
	}

	public void setId(PermisoRolProcesoId id) {
		this.id = id;
	}
}
