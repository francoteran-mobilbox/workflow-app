package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "activities_sub_proceso")
public class ActivitiesSubProceso {

	@EmbeddedId
	private ActivitiesSubProcesoId id;

	public ActivitiesSubProceso() {
	}

	public ActivitiesSubProcesoId getId() {
		return id;
	}

	public void setId(ActivitiesSubProcesoId id) {
		this.id = id;
	}
}
