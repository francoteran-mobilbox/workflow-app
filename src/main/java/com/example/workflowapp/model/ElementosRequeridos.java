package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "elementos_requeridos")
public class ElementosRequeridos {

	@EmbeddedId
	private ElementosRequeridosId id;

	@Column(name = "id_tipo_elemento_requerido")
	private String idTipoElementoRequerido;

	public ElementosRequeridos() {
	}

	public ElementosRequeridosId getId() {
		return id;
	}

	public void setId(ElementosRequeridosId id) {
		this.id = id;
	}

	public String getIdTipoElementoRequerido() {
		return idTipoElementoRequerido;
	}

	public void setIdTipoElementoRequerido(String idTipoElementoRequerido) {
		this.idTipoElementoRequerido = idTipoElementoRequerido;
	}
}
