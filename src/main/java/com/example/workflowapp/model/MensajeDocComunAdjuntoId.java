package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MensajeDocComunAdjuntoId implements Serializable {

	@Column(name = "id_mensaje", nullable = false)
	private Integer idMensaje;

	@Column(name = "nombre_documento_comun", nullable = false)
	private String nombreDocumentoComun;

	public MensajeDocComunAdjuntoId() {
	}

	public MensajeDocComunAdjuntoId(Integer idMensaje, String nombreDocumentoComun) {
		this.idMensaje = idMensaje;
		this.nombreDocumentoComun = nombreDocumentoComun;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getNombreDocumentoComun() {
		return nombreDocumentoComun;
	}

	public void setNombreDocumentoComun(String nombreDocumentoComun) {
		this.nombreDocumentoComun = nombreDocumentoComun;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof MensajeDocComunAdjuntoId that)) {
			return false;
		}
		return Objects.equals(idMensaje, that.idMensaje)
				&& Objects.equals(nombreDocumentoComun, that.nombreDocumentoComun);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMensaje, nombreDocumentoComun);
	}
}
