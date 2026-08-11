package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_grupo_doc_comun")
public class PermisoGrupoDocComun {

	@EmbeddedId
	private PermisoGrupoDocComunId id;

	public PermisoGrupoDocComun() {
	}

	public PermisoGrupoDocComunId getId() {
		return id;
	}

	public void setId(PermisoGrupoDocComunId id) {
		this.id = id;
	}
}
