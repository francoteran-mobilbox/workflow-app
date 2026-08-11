package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolesPreAsignadosId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	public RolesPreAsignadosId() {
	}

	public RolesPreAsignadosId(Integer activityId, Integer idRol) {
		this.activityId = activityId;
		this.idRol = idRol;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof RolesPreAsignadosId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(idRol, that.idRol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idRol);
	}
}
