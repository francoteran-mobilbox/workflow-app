package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensaje_documento_comun_adjunto")
public class MensajeDocComunAdjunto {

	@EmbeddedId
	private MensajeDocComunAdjuntoId id;

	public MensajeDocComunAdjunto() {
	}

	public MensajeDocComunAdjuntoId getId() {
		return id;
	}

	public void setId(MensajeDocComunAdjuntoId id) {
		this.id = id;
	}
}
