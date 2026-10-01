package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MensajeDocumentoId implements Serializable {

	@Column(name = "id_mensaje", nullable = false)
	private Integer idMensaje;

	@Column(name = "id_documento", nullable = false)
	private Integer idDocumento;

	public MensajeDocumentoId() {
	}

	public MensajeDocumentoId(Integer idMensaje, Integer idDocumento) {
		this.idMensaje = idMensaje;
		this.idDocumento = idDocumento;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof MensajeDocumentoId that)) {
			return false;
		}
		return Objects.equals(idMensaje, that.idMensaje)
				&& Objects.equals(idDocumento, that.idDocumento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMensaje, idDocumento);
	}
}
