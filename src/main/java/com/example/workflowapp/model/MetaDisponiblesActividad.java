package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "meta_disponibles_actividad")
public class MetaDisponiblesActividad {

	@EmbeddedId
	private MetaDisponiblesActividadId id;

	@Column(name = "codigo_bloque")
	private String codigoBloque;

	public MetaDisponiblesActividad() {
	}

	public MetaDisponiblesActividadId getId() {
		return id;
	}

	public void setId(MetaDisponiblesActividadId id) {
		this.id = id;
	}

	public String getCodigoBloque() {
		return codigoBloque;
	}

	public void setCodigoBloque(String codigoBloque) {
		this.codigoBloque = codigoBloque;
	}
}
