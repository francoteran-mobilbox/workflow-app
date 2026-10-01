package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class RolGenericoProcesoRequest {

	private Integer idRolGenerico;

	private List<Integer> rolesAsociados = Collections.emptyList();

	public RolGenericoProcesoRequest() {
	}

	public RolGenericoProcesoRequest(Integer idRolGenerico, List<Integer> rolesAsociados) {
		this.idRolGenerico = idRolGenerico;
		this.rolesAsociados = rolesAsociados;
	}

	public Integer getIdRolGenerico() {
		return idRolGenerico;
	}

	public void setIdRolGenerico(Integer idRolGenerico) {
		this.idRolGenerico = idRolGenerico;
	}

	public List<Integer> getRolesAsociados() {
		return rolesAsociados;
	}

	public void setRolesAsociados(List<Integer> rolesAsociados) {
		this.rolesAsociados = rolesAsociados;
	}
}