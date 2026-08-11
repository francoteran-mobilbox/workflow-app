package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_proceso")
public class PermisoProceso {

	@EmbeddedId
	private PermisoProcesoId id;

	public PermisoProceso() {
	}

	public PermisoProcesoId getId() {
		return id;
	}

	public void setId(PermisoProcesoId id) {
		this.id = id;
	}
}
