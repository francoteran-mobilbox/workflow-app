package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso_grupo_proceso")
public class PermisoGrupoProceso {

	@EmbeddedId
	private PermisoGrupoProcesoId id;

	public PermisoGrupoProceso() {
	}

	public PermisoGrupoProcesoId getId() {
		return id;
	}

	public void setId(PermisoGrupoProcesoId id) {
		this.id = id;
	}
}
