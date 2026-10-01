package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensaje_documento")
public class MensajeDocumento {

	@EmbeddedId
	private MensajeDocumentoId id;

	@Column(name = "minimo_respuestas")
	private Integer minimoRespuestas;

	public MensajeDocumento() {
	}

	public MensajeDocumentoId getId() {
		return id;
	}

	public void setId(MensajeDocumentoId id) {
		this.id = id;
	}

	public Integer getMinimoRespuestas() {
		return minimoRespuestas;
	}

	public void setMinimoRespuestas(Integer minimoRespuestas) {
		this.minimoRespuestas = minimoRespuestas;
	}
}
