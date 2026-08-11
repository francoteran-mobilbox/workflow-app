package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecursosActividadId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_recurso", nullable = false)
	private String idRecurso;

	public RecursosActividadId() {
	}

	public RecursosActividadId(Integer activityId, String idRecurso) {
		this.activityId = activityId;
		this.idRecurso = idRecurso;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(String idRecurso) {
		this.idRecurso = idRecurso;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof RecursosActividadId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(idRecurso, that.idRecurso);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idRecurso);
	}
}
