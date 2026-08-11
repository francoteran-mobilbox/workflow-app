package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ElementosRequeridosId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_elemento", nullable = false)
	private Integer idElemento;

	public ElementosRequeridosId() {
	}

	public ElementosRequeridosId(Integer activityId, Integer idElemento) {
		this.activityId = activityId;
		this.idElemento = idElemento;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(Integer idElemento) {
		this.idElemento = idElemento;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ElementosRequeridosId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(idElemento, that.idElemento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idElemento);
	}
}
