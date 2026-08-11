package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoUsuarioDocComunId implements Serializable {

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	@Column(name = "id_usuario", nullable = false, length = 50)
	private String idUsuario;

	public PermisoUsuarioDocComunId() {
	}

	public PermisoUsuarioDocComunId(Integer docComunId, String idUsuario) {
		this.docComunId = docComunId;
		this.idUsuario = idUsuario;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PermisoUsuarioDocComunId that)) {
			return false;
		}
		return Objects.equals(docComunId, that.docComunId) && Objects.equals(idUsuario, that.idUsuario);
	}

	@Override
	public int hashCode() {
		return Objects.hash(docComunId, idUsuario);
	}
}
