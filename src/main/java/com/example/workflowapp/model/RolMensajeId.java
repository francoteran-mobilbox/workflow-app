package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolMensajeId implements Serializable {

	@Column(name = "id_mensaje", nullable = false)
	private Integer idMensaje;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	public RolMensajeId() {
	}

	public RolMensajeId(Integer idMensaje, Integer idRol) {
		this.idMensaje = idMensaje;
		this.idRol = idRol;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof RolMensajeId that)) {
			return false;
		}
		return Objects.equals(idMensaje, that.idMensaje)
				&& Objects.equals(idRol, that.idRol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMensaje, idRol);
	}
}
