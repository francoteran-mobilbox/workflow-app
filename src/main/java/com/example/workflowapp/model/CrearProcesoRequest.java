package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class CrearProcesoRequest {

	private WorkflowProcess proceso;

	private List<String> permisosUsuarios = Collections.emptyList();

	private List<Integer> permisosRoles = Collections.emptyList();

	private List<Integer> permisosGrupos = Collections.emptyList();

	private List<RolGenericoProcesoRequest> rolesGenericosProceso = Collections.emptyList();

	private List<DocumentoComunPermisosRequest> documentosComunes = Collections.emptyList();

	private List<ResponsableProcesoRequest> cargosResponsables = Collections.emptyList();

	private DatoMecanismoRequest procesoMecanismo;

	private List<ActividadRequest> actividades = Collections.emptyList();

	private List<TransicionRequest> transiciones = Collections.emptyList();

	private boolean publicaEnCatalogo;

	private int idDocumentoPublicar;

	private List<Integer> catalogos = Collections.emptyList();

	public WorkflowProcess getProceso() {
		return proceso;
	}

	public void setProceso(WorkflowProcess proceso) {
		this.proceso = proceso;
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

	public List<RolGenericoProcesoRequest> getRolesGenericosProceso() {
		return rolesGenericosProceso;
	}

	public void setRolesGenericosProceso(List<RolGenericoProcesoRequest> rolesGenericosProceso) {
		this.rolesGenericosProceso = rolesGenericosProceso;
	}

	public List<DocumentoComunPermisosRequest> getDocumentosComunes() {
		return documentosComunes;
	}

	public void setDocumentosComunes(List<DocumentoComunPermisosRequest> documentosComunes) {
		this.documentosComunes = documentosComunes;
	}

	public List<ResponsableProcesoRequest> getCargosResponsables() {
		return cargosResponsables;
	}

	public void setCargosResponsables(List<ResponsableProcesoRequest> cargosResponsables) {
		this.cargosResponsables = cargosResponsables;
	}

	public DatoMecanismoRequest getProcesoMecanismo() {
		return procesoMecanismo;
	}

	public void setProcesoMecanismo(DatoMecanismoRequest procesoMecanismo) {
		this.procesoMecanismo = procesoMecanismo;
	}

	public List<ActividadRequest> getActividades() {
		return actividades;
	}

	public void setActividades(List<ActividadRequest> actividades) {
		this.actividades = actividades;
	}

	public List<TransicionRequest> getTransiciones() {
		return transiciones;
	}

	public void setTransiciones(List<TransicionRequest> transiciones) {
		this.transiciones = transiciones;
	}

	public boolean isPublicaEnCatalogo() {
		return publicaEnCatalogo;
	}

	public void setPublicaEnCatalogo(boolean publicaEnCatalogo) {
		this.publicaEnCatalogo = publicaEnCatalogo;
	}

	public int getIdDocumentoPublicar() {
		return idDocumentoPublicar;
	}

	public void setIdDocumentoPublicar(int idDocumentoPublicar) {
		this.idDocumentoPublicar = idDocumentoPublicar;
	}

	public List<Integer> getCatalogos() {
		return catalogos;
	}

	public void setCatalogos(List<Integer> catalogos) {
		this.catalogos = catalogos;
	}
}