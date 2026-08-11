package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoGrupoDocComunId implements Serializable {

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	@Column(name = "id_grupo", nullable = false)
	private Integer idGrupo;

	public PermisoGrupoDocComunId() {
	}

	public PermisoGrupoDocComunId(Integer docComunId, Integer idGrupo) {
		this.docComunId = docComunId;
		this.idGrupo = idGrupo;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public Integer getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PermisoGrupoDocComunId that)) {
			return false;
		}
		return Objects.equals(docComunId, that.docComunId) && Objects.equals(idGrupo, that.idGrupo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(docComunId, idGrupo);
	}
}
