package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recursos_actividad")
public class RecursosActividad {

	@EmbeddedId
	private RecursosActividadId id;

	public RecursosActividad() {
	}

	public RecursosActividadId getId() {
		return id;
	}

	public void setId(RecursosActividadId id) {
		this.id = id;
	}
}
