package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermisoProcesoCondicionId implements Serializable {

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	@Column(name = "id_condicion_proceso", nullable = false)
	private Integer idCondicionProceso;

	public PermisoProcesoCondicionId() {
	}

	public PermisoProcesoCondicionId(Integer processId, Integer idRol, Integer idCondicionProceso) {
		this.processId = processId;
		this.idRol = idRol;
		this.idCondicionProceso = idCondicionProceso;
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

	public Integer getIdCondicionProceso() {
		return idCondicionProceso;
	}

	public void setIdCondicionProceso(Integer idCondicionProceso) {
		this.idCondicionProceso = idCondicionProceso;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PermisoProcesoCondicionId that)) {
			return false;
		}
		return Objects.equals(processId, that.processId)
				&& Objects.equals(idRol, that.idRol)
				&& Objects.equals(idCondicionProceso, that.idCondicionProceso);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processId, idRol, idCondicionProceso);
	}
}
