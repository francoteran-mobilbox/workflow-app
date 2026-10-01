package com.example.workflowapp.model;

public class OperandoReglaRequest {

	private String valorOperando;

	private Boolean esDoc;

	private String nombreDocComun;

	private Integer idBloque;

	private String codigoBloque;

	private Integer idMetadato;

	private String idTipoDato;

	public String getValorOperando() {
		return valorOperando;
	}

	public void setValorOperando(String valorOperando) {
		this.valorOperando = valorOperando;
	}

	public Boolean getEsDoc() {
		return esDoc;
	}

	public void setEsDoc(Boolean esDoc) {
		this.esDoc = esDoc;
	}

	public String getNombreDocComun() {
		return nombreDocComun;
	}

	public void setNombreDocComun(String nombreDocComun) {
		this.nombreDocComun = nombreDocComun;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}

	public String getCodigoBloque() {
		return codigoBloque;
	}

	public void setCodigoBloque(String codigoBloque) {
		this.codigoBloque = codigoBloque;
	}

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
	}

	public String getIdTipoDato() {
		return idTipoDato;
	}

	public void setIdTipoDato(String idTipoDato) {
		this.idTipoDato = idTipoDato;
	}
}