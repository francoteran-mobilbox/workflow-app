package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DocumentoComunActividadId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	public DocumentoComunActividadId() {
	}

	public DocumentoComunActividadId(Integer activityId, Integer docComunId) {
		this.activityId = activityId;
		this.docComunId = docComunId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof DocumentoComunActividadId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(docComunId, that.docComunId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, docComunId);
	}
}
