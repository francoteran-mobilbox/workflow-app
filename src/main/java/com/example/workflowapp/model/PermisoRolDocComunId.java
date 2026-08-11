package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoRolDocComunId implements Serializable {

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	public PermisoRolDocComunId() {
	}

	public PermisoRolDocComunId(Integer docComunId, Integer idRol) {
		this.docComunId = docComunId;
		this.idRol = idRol;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
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
		if (!(o instanceof PermisoRolDocComunId that)) {
			return false;
		}
		return Objects.equals(docComunId, that.docComunId) && Objects.equals(idRol, that.idRol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(docComunId, idRol);
	}
}
