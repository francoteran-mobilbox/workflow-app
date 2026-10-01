package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioMensajeId implements Serializable {

	@Column(name = "id_mensaje", nullable = false)
	private Integer idMensaje;

	@Column(name = "destinatario", nullable = false)
	private String destinatario;

	public UsuarioMensajeId() {
	}

	public UsuarioMensajeId(Integer idMensaje, String destinatario) {
		this.idMensaje = idMensaje;
		this.destinatario = destinatario;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof UsuarioMensajeId that)) {
			return false;
		}
		return Objects.equals(idMensaje, that.idMensaje)
				&& Objects.equals(destinatario, that.destinatario);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMensaje, destinatario);
	}
}
