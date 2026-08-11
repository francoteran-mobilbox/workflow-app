package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoProcesoId implements Serializable {

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	@Column(name = "id_usuario", nullable = false, length = 50)
	private String idUsuario;

	public PermisoProcesoId() {
	}

	public PermisoProcesoId(Integer processId, String idUsuario) {
		this.processId = processId;
		this.idUsuario = idUsuario;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
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
		if (!(o instanceof PermisoProcesoId that)) {
			return false;
		}
		return Objects.equals(processId, that.processId) && Objects.equals(idUsuario, that.idUsuario);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processId, idUsuario);
	}
}
