package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TransitionReglaUsuarioId implements Serializable {

	@Column(name = "transition_id", nullable = false)
	private Integer transitionId;

	@Column(name = "id_regla_usuario", nullable = false)
	private Integer idReglaUsuario;

	public TransitionReglaUsuarioId() {
	}

	public TransitionReglaUsuarioId(Integer transitionId, Integer idReglaUsuario) {
		this.transitionId = transitionId;
		this.idReglaUsuario = idReglaUsuario;
	}

	public Integer getTransitionId() {
		return transitionId;
	}

	public void setTransitionId(Integer transitionId) {
		this.transitionId = transitionId;
	}

	public Integer getIdReglaUsuario() {
		return idReglaUsuario;
	}

	public void setIdReglaUsuario(Integer idReglaUsuario) {
		this.idReglaUsuario = idReglaUsuario;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof TransitionReglaUsuarioId that)) {
			return false;
		}
		return Objects.equals(transitionId, that.transitionId)
				&& Objects.equals(idReglaUsuario, that.idReglaUsuario);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transitionId, idReglaUsuario);
	}
}