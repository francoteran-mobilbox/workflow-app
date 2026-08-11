package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles_pre_asignados")
public class RolesPreAsignados {

	@EmbeddedId
	private RolesPreAsignadosId id;

	public RolesPreAsignados() {
	}

	public RolesPreAsignadosId getId() {
		return id;
	}

	public void setId(RolesPreAsignadosId id) {
		this.id = id;
	}
}
