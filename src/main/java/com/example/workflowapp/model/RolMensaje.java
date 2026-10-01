package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_mensaje")
public class RolMensaje {

	@EmbeddedId
	private RolMensajeId id;

	public RolMensaje() {
	}

	public RolMensajeId getId() {
		return id;
	}

	public void setId(RolMensajeId id) {
		this.id = id;
	}
}
