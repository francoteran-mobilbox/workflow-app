package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "transition_timer_proceso")
public class TransitionTimerProceso {

	@EmbeddedId
	private TransitionTimerProcesoId id;

	@Column(name = "con_interrupcion")
	private Boolean conInterrupcion;

	public TransitionTimerProceso() {
	}

	public TransitionTimerProcesoId getId() {
		return id;
	}

	public void setId(TransitionTimerProcesoId id) {
		this.id = id;
	}

	public Boolean getConInterrupcion() {
		return conInterrupcion;
	}

	public void setConInterrupcion(Boolean conInterrupcion) {
		this.conInterrupcion = conInterrupcion;
	}
}