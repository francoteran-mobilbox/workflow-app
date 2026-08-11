package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActivityTimerProcesoId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_timer_proceso", nullable = false)
	private Integer idTimerProceso;

	public ActivityTimerProcesoId() {
	}

	public ActivityTimerProcesoId(Integer activityId, Integer idTimerProceso) {
		this.activityId = activityId;
		this.idTimerProceso = idTimerProceso;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
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
		if (!(o instanceof ActivityTimerProcesoId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(idTimerProceso, that.idTimerProceso);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idTimerProceso);
	}
}
