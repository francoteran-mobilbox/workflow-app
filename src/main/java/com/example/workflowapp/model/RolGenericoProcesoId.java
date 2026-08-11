package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolGenericoProcesoId implements Serializable {

	@Column(name = "id_proceso", nullable = false)
	private Integer idProceso;

	@Column(name = "id_rol_generico", nullable = false)
	private Integer idRolGenerico;

	@Column(name = "id_rol", nullable = false)
	private Integer idRol;

	public RolGenericoProcesoId() {
	}

	public RolGenericoProcesoId(Integer idProceso, Integer idRolGenerico, Integer idRol) {
		this.idProceso = idProceso;
		this.idRolGenerico = idRolGenerico;
		this.idRol = idRol;
	}

	public Integer getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public Integer getIdRolGenerico() {
		return idRolGenerico;
	}

	public void setIdRolGenerico(Integer idRolGenerico) {
		this.idRolGenerico = idRolGenerico;
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
		if (!(o instanceof RolGenericoProcesoId that)) {
			return false;
		}
		return Objects.equals(idProceso, that.idProceso)
				&& Objects.equals(idRolGenerico, that.idRolGenerico)
				&& Objects.equals(idRol, that.idRol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProceso, idRolGenerico, idRol);
	}
}
