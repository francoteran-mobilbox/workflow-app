package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_generico_actividad")
public class RolGenericoActividad {

	@EmbeddedId
	private RolGenericoActividadId id;

	public RolGenericoActividad() {
	}

	public RolGenericoActividadId getId() {
		return id;
	}

	public void setId(RolGenericoActividadId id) {
		this.id = id;
	}
}
