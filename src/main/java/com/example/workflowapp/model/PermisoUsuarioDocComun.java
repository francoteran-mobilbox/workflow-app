package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_usuario_doc_comun")
public class PermisoUsuarioDocComun {

	@EmbeddedId
	private PermisoUsuarioDocComunId id;

	public PermisoUsuarioDocComun() {
	}

	public PermisoUsuarioDocComunId getId() {
		return id;
	}

	public void setId(PermisoUsuarioDocComunId id) {
		this.id = id;
	}
}
