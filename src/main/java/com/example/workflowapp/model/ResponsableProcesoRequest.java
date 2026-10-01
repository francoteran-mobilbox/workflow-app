package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class ResponsableProcesoRequest {

	private Integer idRol;

	private List<CondicionVisibilidadRequest> condicionesVisibilidad = Collections.emptyList();

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public List<CondicionVisibilidadRequest> getCondicionesVisibilidad() {
		return condicionesVisibilidad;
	}

	public void setCondicionesVisibilidad(List<CondicionVisibilidadRequest> condicionesVisibilidad) {
		this.condicionesVisibilidad = condicionesVisibilidad;
	}
}