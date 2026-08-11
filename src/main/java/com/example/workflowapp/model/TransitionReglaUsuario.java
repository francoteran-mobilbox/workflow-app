package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "transition_regla_usuario")
public class TransitionReglaUsuario {

	@EmbeddedId
	private TransitionReglaUsuarioId id;

	public TransitionReglaUsuario() {
	}

	public TransitionReglaUsuarioId getId() {
		return id;
	}

	public void setId(TransitionReglaUsuarioId id) {
		this.id = id;
	}
}