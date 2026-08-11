package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoRolProcesoId implements Serializable {

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	public PermisoRolProcesoId() {
	}

	public PermisoRolProcesoId(Integer processId, Integer idRol) {
		this.processId = processId;
		this.idRol = idRol;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
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
		if (!(o instanceof PermisoRolProcesoId that)) {
			return false;
		}
		return Objects.equals(processId, that.processId) && Objects.equals(idRol, that.idRol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processId, idRol);
	}
}
