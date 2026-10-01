package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class ActividadRequest {

	private Activity actividad;

	private List<RolGenericoActividadRequest> rolesGenericos = Collections.emptyList();

	private List<UsuarioPreAsignadoRequest> usuariosPreAsignados = Collections.emptyList();

	private List<Integer> rolesPreAsignados = Collections.emptyList();

	private List<DocumentoComunActividadRequest> documentosComunesActividad = Collections.emptyList();

	private List<ElementosRequeridosRequest> elementosRequeridos = Collections.emptyList();

	private Integer idSubProceso;

	private RegistroExternoRequest registroExterno;

	private TimerProceso timer;

	private MensajeActividadRequest mensaje;

	public Activity getActividad() {
		return actividad;
	}

	public void setActividad(Activity actividad) {
		this.actividad = actividad;
	}

	public List<RolGenericoActividadRequest> getRolesGenericos() {
		return rolesGenericos;
	}

	public void setRolesGenericos(List<RolGenericoActividadRequest> rolesGenericos) {
		this.rolesGenericos = rolesGenericos;
	}

	public List<UsuarioPreAsignadoRequest> getUsuariosPreAsignados() {
		return usuariosPreAsignados;
	}

	public void setUsuariosPreAsignados(List<UsuarioPreAsignadoRequest> usuariosPreAsignados) {
		this.usuariosPreAsignados = usuariosPreAsignados;
	}

	public List<Integer> getRolesPreAsignados() {
		return rolesPreAsignados;
	}

	public void setRolesPreAsignados(List<Integer> rolesPreAsignados) {
		this.rolesPreAsignados = rolesPreAsignados;
	}

	public List<DocumentoComunActividadRequest> getDocumentosComunesActividad() {
		return documentosComunesActividad;
	}

	public void setDocumentosComunesActividad(List<DocumentoComunActividadRequest> documentosComunesActividad) {
		this.documentosComunesActividad = documentosComunesActividad;
	}

	public List<ElementosRequeridosRequest> getElementosRequeridos() {
		return elementosRequeridos;
	}

	public void setElementosRequeridos(List<ElementosRequeridosRequest> elementosRequeridos) {
		this.elementosRequeridos = elementosRequeridos;
	}

	public Integer getIdSubProceso() {
		return idSubProceso;
	}

	public void setIdSubProceso(Integer idSubProceso) {
		this.idSubProceso = idSubProceso;
	}

	public RegistroExternoRequest getRegistroExterno() {
		return registroExterno;
	}

	public void setRegistroExterno(RegistroExternoRequest registroExterno) {
		this.registroExterno = registroExterno;
	}

	public TimerProceso getTimer() {
		return timer;
	}

	public void setTimer(TimerProceso timer) {
		this.timer = timer;
	}

	public MensajeActividadRequest getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeActividadRequest mensaje) {
		this.mensaje = mensaje;
	}
}