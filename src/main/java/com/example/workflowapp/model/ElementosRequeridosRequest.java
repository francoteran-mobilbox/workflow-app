package com.example.workflowapp.model;

public class ElementosRequeridosRequest {

	private Integer idElemento;

	private String idTipoElementoRequerido;

	public Integer getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(Integer idElemento) {
		this.idElemento = idElemento;
	}

	public String getIdTipoElementoRequerido() {
		return idTipoElementoRequerido;
	}

	public void setIdTipoElementoRequerido(String idTipoElementoRequerido) {
		this.idTipoElementoRequerido = idTipoElementoRequerido;
	}
}