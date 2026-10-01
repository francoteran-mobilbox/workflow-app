package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class DocumentoComunPermisosRequest {

	private DocumentoComunProceso documentoComunProceso;

	private List<String> permisosUsuarios = Collections.emptyList();

	private List<Integer> permisosRoles = Collections.emptyList();

	private List<Integer> permisosGrupos = Collections.emptyList();

	public DocumentoComunProceso getDocumentoComunProceso() {
		return documentoComunProceso;
	}

	public void setDocumentoComunProceso(DocumentoComunProceso documentoComunProceso) {
		this.documentoComunProceso = documentoComunProceso;
	}

	public List<String> getPermisosUsuarios() {
		return permisosUsuarios;
	}

	public void setPermisosUsuarios(List<String> permisosUsuarios) {
		this.permisosUsuarios = permisosUsuarios;
	}

	public List<Integer> getPermisosRoles() {
		return permisosRoles;
	}

	public void setPermisosRoles(List<Integer> permisosRoles) {
		this.permisosRoles = permisosRoles;
	}

	public List<Integer> getPermisosGrupos() {
		return permisosGrupos;
	}

	public void setPermisosGrupos(List<Integer> permisosGrupos) {
		this.permisosGrupos = permisosGrupos;
	}
}