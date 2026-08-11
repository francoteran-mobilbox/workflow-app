package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_generico_proceso")
public class RolGenericoProceso {

	@EmbeddedId
	private RolGenericoProcesoId id;

	public RolGenericoProceso() {
	}

	public RolGenericoProcesoId getId() {
		return id;
	}

	public void setId(RolGenericoProcesoId id) {
		this.id = id;
	}
}
