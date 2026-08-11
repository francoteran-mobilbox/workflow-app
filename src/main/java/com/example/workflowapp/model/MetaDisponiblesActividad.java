package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "meta_disponibles_actividad")
public class MetaDisponiblesActividad {

	@EmbeddedId
	private MetaDisponiblesActividadId id;

	public MetaDisponiblesActividad() {
	}

	public MetaDisponiblesActividadId getId() {
		return id;
	}

	public void setId(MetaDisponiblesActividadId id) {
		this.id = id;
	}
}
