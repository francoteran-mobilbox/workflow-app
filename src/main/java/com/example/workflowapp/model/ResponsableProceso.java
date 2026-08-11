package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "responsable_proceso")
public class ResponsableProceso {

	@EmbeddedId
	private ResponsableProcesoId id;

	public ResponsableProceso() {
	}

	public ResponsableProcesoId getId() {
		return id;
	}

	public void setId(ResponsableProcesoId id) {
		this.id = id;
	}
}
