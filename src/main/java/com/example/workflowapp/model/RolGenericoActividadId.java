package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolGenericoActividadId implements Serializable {

	@Column(name = "id_actividad", nullable = false)
	private Integer idActividad;

	@Column(name = "id_rol_generico", nullable = false)
	private Integer idRolGenerico;

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	public RolGenericoActividadId() {
	}

	public RolGenericoActividadId(Integer idActividad, Integer idRolGenerico, Integer processId) {
		this.idActividad = idActividad;
		this.idRolGenerico = idRolGenerico;
		this.processId = processId;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public Integer getIdRolGenerico() {
		return idRolGenerico;
	}

	public void setIdRolGenerico(Integer idRolGenerico) {
		this.idRolGenerico = idRolGenerico;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof RolGenericoActividadId that)) {
			return false;
		}
		return Objects.equals(idActividad, that.idActividad)
				&& Objects.equals(idRolGenerico, that.idRolGenerico)
				&& Objects.equals(processId, that.processId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idActividad, idRolGenerico, processId);
	}
}
