package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_proceso_condicion")
public class PermisoProcesoCondicion {

	@EmbeddedId
	private PermisoProcesoCondicionId id;

	public PermisoProcesoCondicion() {
	}

	public PermisoProcesoCondicionId getId() {
		return id;
	}

	public void setId(PermisoProcesoCondicionId id) {
		this.id = id;
	}
}
