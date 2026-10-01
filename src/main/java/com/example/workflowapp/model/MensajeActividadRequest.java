package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class MensajeActividadRequest {

	private String asunto;

	private String contenido;

	private Boolean encabezado;

	private Boolean cc;

	private Boolean enviaACargo;

	private Boolean enviaFormularioExterno;

	private List<String> usuariosSistema = Collections.emptyList();

	private List<String> usuariosSistemaCc = Collections.emptyList();

	private List<String> usuariosExternos = Collections.emptyList();

	private List<String> usuariosExternosCc = Collections.emptyList();

	private List<Integer> rolesSistema = Collections.emptyList();

	private List<DestinatarioMetadatoRequest> destinatariosMetadato = Collections.emptyList();

	private List<DestinatarioMetadatoRequest> destinatariosMetadatoCc = Collections.emptyList();

	private List<MensajeDocumentoRequest> documentosFormulario = Collections.emptyList();

	private List<String> documentosAdjuntos = Collections.emptyList();

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Boolean getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Boolean encabezado) {
		this.encabezado = encabezado;
	}

	public Boolean getCc() {
		return cc;
	}

	public void setCc(Boolean cc) {
		this.cc = cc;
	}

	public Boolean getEnviaACargo() {
		return enviaACargo;
	}

	public void setEnviaACargo(Boolean enviaACargo) {
		this.enviaACargo = enviaACargo;
	}

	public Boolean getEnviaFormularioExterno() {
		return enviaFormularioExterno;
	}

	public void setEnviaFormularioExterno(Boolean enviaFormularioExterno) {
		this.enviaFormularioExterno = enviaFormularioExterno;
	}

	public List<String> getUsuariosSistema() {
		return usuariosSistema;
	}

	public void setUsuariosSistema(List<String> usuariosSistema) {
		this.usuariosSistema = usuariosSistema;
	}

	public List<String> getUsuariosSistemaCc() {
		return usuariosSistemaCc;
	}

	public void setUsuariosSistemaCc(List<String> usuariosSistemaCc) {
		this.usuariosSistemaCc = usuariosSistemaCc;
	}

	public List<String> getUsuariosExternos() {
		return usuariosExternos;
	}

	public void setUsuariosExternos(List<String> usuariosExternos) {
		this.usuariosExternos = usuariosExternos;
	}

	public List<String> getUsuariosExternosCc() {
		return usuariosExternosCc;
	}

	public void setUsuariosExternosCc(List<String> usuariosExternosCc) {
		this.usuariosExternosCc = usuariosExternosCc;
	}

	public List<Integer> getRolesSistema() {
		return rolesSistema;
	}

	public void setRolesSistema(List<Integer> rolesSistema) {
		this.rolesSistema = rolesSistema;
	}

	public List<DestinatarioMetadatoRequest> getDestinatariosMetadato() {
		return destinatariosMetadato;
	}

	public void setDestinatariosMetadato(List<DestinatarioMetadatoRequest> destinatariosMetadato) {
		this.destinatariosMetadato = destinatariosMetadato;
	}

	public List<DestinatarioMetadatoRequest> getDestinatariosMetadatoCc() {
		return destinatariosMetadatoCc;
	}

	public void setDestinatariosMetadatoCc(List<DestinatarioMetadatoRequest> destinatariosMetadatoCc) {
		this.destinatariosMetadatoCc = destinatariosMetadatoCc;
	}

	public List<MensajeDocumentoRequest> getDocumentosFormulario() {
		return documentosFormulario;
	}

	public void setDocumentosFormulario(List<MensajeDocumentoRequest> documentosFormulario) {
		this.documentosFormulario = documentosFormulario;
	}

	public List<String> getDocumentosAdjuntos() {
		return documentosAdjuntos;
	}

	public void setDocumentosAdjuntos(List<String> documentosAdjuntos) {
		this.documentosAdjuntos = documentosAdjuntos;
	}
}
