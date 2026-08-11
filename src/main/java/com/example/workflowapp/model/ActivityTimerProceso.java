package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity_timer_proceso")
public class ActivityTimerProceso {

	@EmbeddedId
	private ActivityTimerProcesoId id;

	public ActivityTimerProceso() {
	}

	public ActivityTimerProcesoId getId() {
		return id;
	}

	public void setId(ActivityTimerProcesoId id) {
		this.id = id;
	}
}
