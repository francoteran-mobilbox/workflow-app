package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_rol_doc_comun")
public class PermisoRolDocComun {

	@EmbeddedId
	private PermisoRolDocComunId id;

	public PermisoRolDocComun() {
	}

	public PermisoRolDocComunId getId() {
		return id;
	}

	public void setId(PermisoRolDocComunId id) {
		this.id = id;
	}
}
