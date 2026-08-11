package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios_pre_asignados")
public class UsuariosPreAsignados {

	@EmbeddedId
	private UsuariosPreAsignadosId id;

	public UsuariosPreAsignados() {
	}

	public UsuariosPreAsignadosId getId() {
		return id;
	}

	public void setId(UsuariosPreAsignadosId id) {
		this.id = id;
	}
}
