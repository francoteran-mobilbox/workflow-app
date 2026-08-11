package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoGrupoProcesoId implements Serializable {

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	@Column(name = "id_grupo", nullable = false)
	private Integer idGrupo;

	public PermisoGrupoProcesoId() {
	}

	public PermisoGrupoProcesoId(Integer processId, Integer idGrupo) {
		this.processId = processId;
		this.idGrupo = idGrupo;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
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
		if (!(o instanceof PermisoGrupoProcesoId that)) {
			return false;
		}
		return Objects.equals(processId, that.processId) && Objects.equals(idGrupo, that.idGrupo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processId, idGrupo);
	}
}
