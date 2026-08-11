package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "transition_regla_negocio")
public class TransitionReglaNegocio {

	@EmbeddedId
	private TransitionReglaNegocioId id;

	public TransitionReglaNegocio() {
	}

	public TransitionReglaNegocioId getId() {
		return id;
	}

	public void setId(TransitionReglaNegocioId id) {
		this.id = id;
	}
}