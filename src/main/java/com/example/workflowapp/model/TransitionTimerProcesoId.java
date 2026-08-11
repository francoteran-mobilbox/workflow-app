package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TransitionTimerProcesoId implements Serializable {

	@Column(name = "transition_id", nullable = false)
	private Integer transitionId;

	@Column(name = "id_timer_proceso", nullable = false)
	private Integer idTimerProceso;

	public TransitionTimerProcesoId() {
	}

	public TransitionTimerProcesoId(Integer transitionId, Integer idTimerProceso) {
		this.transitionId = transitionId;
		this.idTimerProceso = idTimerProceso;
	}

	public Integer getTransitionId() {
		return transitionId;
	}

	public void setTransitionId(Integer transitionId) {
		this.transitionId = transitionId;
	}

	public Integer getIdTimerProceso() {
		return idTimerProceso;
	}

	public void setIdTimerProceso(Integer idTimerProceso) {
		this.idTimerProceso = idTimerProceso;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof TransitionTimerProcesoId that)) {
			return false;
		}
		return Objects.equals(transitionId, that.transitionId) && Objects.equals(idTimerProceso, that.idTimerProceso);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transitionId, idTimerProceso);
	}
}