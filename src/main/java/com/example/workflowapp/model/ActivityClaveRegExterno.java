package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity_clave_reg_externo")
public class ActivityClaveRegExterno {

	@EmbeddedId
	private ActivityClaveRegExternoId id;

	public ActivityClaveRegExterno() {
	}

	public ActivityClaveRegExternoId getId() {
		return id;
	}

	public void setId(ActivityClaveRegExternoId id) {
		this.id = id;
	}
}
