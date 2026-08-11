package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActivitiesSubProcesoId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	public ActivitiesSubProcesoId() {
	}

	public ActivitiesSubProcesoId(Integer activityId, Integer processId) {
		this.activityId = activityId;
		this.processId = processId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ActivitiesSubProcesoId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId) && Objects.equals(processId, that.processId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, processId);
	}
}
