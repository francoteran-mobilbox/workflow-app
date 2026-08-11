package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActivityClaveRegExternoId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_clave_registro_externo", nullable = false)
	private Integer idClaveRegistroExterno;

	public ActivityClaveRegExternoId() {
	}

	public ActivityClaveRegExternoId(Integer activityId, Integer idClaveRegistroExterno) {
		this.activityId = activityId;
		this.idClaveRegistroExterno = idClaveRegistroExterno;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getIdClaveRegistroExterno() {
		return idClaveRegistroExterno;
	}

	public void setIdClaveRegistroExterno(Integer idClaveRegistroExterno) {
		this.idClaveRegistroExterno = idClaveRegistroExterno;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ActivityClaveRegExternoId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId)
				&& Objects.equals(idClaveRegistroExterno, that.idClaveRegistroExterno);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idClaveRegistroExterno);
	}
}
