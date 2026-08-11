package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TransitionReglaNegocioId implements Serializable {

	@Column(name = "transition_id", nullable = false)
	private Integer transitionId;

	@Column(name = "id_regla_negocio", nullable = false)
	private Integer idReglaNegocio;

	public TransitionReglaNegocioId() {
	}

	public TransitionReglaNegocioId(Integer transitionId, Integer idReglaNegocio) {
		this.transitionId = transitionId;
		this.idReglaNegocio = idReglaNegocio;
	}

	public Integer getTransitionId() {
		return transitionId;
	}

	public void setTransitionId(Integer transitionId) {
		this.transitionId = transitionId;
	}

	public Integer getIdReglaNegocio() {
		return idReglaNegocio;
	}

	public void setIdReglaNegocio(Integer idReglaNegocio) {
		this.idReglaNegocio = idReglaNegocio;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof TransitionReglaNegocioId that)) {
			return false;
		}
		return Objects.equals(transitionId, that.transitionId)
				&& Objects.equals(idReglaNegocio, that.idReglaNegocio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transitionId, idReglaNegocio);
	}
}