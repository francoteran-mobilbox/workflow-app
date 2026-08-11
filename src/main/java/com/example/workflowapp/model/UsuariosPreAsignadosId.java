package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuariosPreAsignadosId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_usuario", nullable = false)
	private String idUsuario;

	@Column(name = "id_procedencia", nullable = false)
	private String idProcedencia;

	public UsuariosPreAsignadosId() {
	}

	public UsuariosPreAsignadosId(Integer activityId, String idUsuario, String idProcedencia) {
		this.activityId = activityId;
		this.idUsuario = idUsuario;
		this.idProcedencia = idProcedencia;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdProcedencia() {
		return idProcedencia;
	}

	public void setIdProcedencia(String idProcedencia) {
		this.idProcedencia = idProcedencia;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof UsuariosPreAsignadosId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId)
				&& Objects.equals(idUsuario, that.idUsuario)
				&& Objects.equals(idProcedencia, that.idProcedencia);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, idUsuario, idProcedencia);
	}
}
