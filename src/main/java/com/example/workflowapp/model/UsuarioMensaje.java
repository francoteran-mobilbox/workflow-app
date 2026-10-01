package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_mensaje")
public class UsuarioMensaje {

	@EmbeddedId
	private UsuarioMensajeId id;

	@Column(name = "usuario_sistema", nullable = false)
	private Boolean usuarioSistema;

	@Column(name = "copia", nullable = false)
	private Boolean copia;

	@Column(name = "es_metadato")
	private Boolean esMetadato;

	public UsuarioMensaje() {
	}

	public UsuarioMensajeId getId() {
		return id;
	}

	public void setId(UsuarioMensajeId id) {
		this.id = id;
	}

	public Boolean getUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(Boolean usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	public Boolean getCopia() {
		return copia;
	}

	public void setCopia(Boolean copia) {
		this.copia = copia;
	}

	public Boolean getEsMetadato() {
		return esMetadato;
	}

	public void setEsMetadato(Boolean esMetadato) {
		this.esMetadato = esMetadato;
	}
}
