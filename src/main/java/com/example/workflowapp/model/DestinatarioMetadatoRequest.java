package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class DestinatarioMetadatoRequest {

	private String nombreDocComun;

	private Integer idMetadato;

	private Integer idBloque;

	private String codigoBloque;

	private Boolean esGrilla;

	private List<ColumnaGrillaMensajeRequest> columnasGrilla = Collections.emptyList();

	public String getNombreDocComun() {
		return nombreDocComun;
	}

	public void setNombreDocComun(String nombreDocComun) {
		this.nombreDocComun = nombreDocComun;
	}

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
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

	public Boolean getEsGrilla() {
		return esGrilla;
	}

	public void setEsGrilla(Boolean esGrilla) {
		this.esGrilla = esGrilla;
	}

	public List<ColumnaGrillaMensajeRequest> getColumnasGrilla() {
		return columnasGrilla;
	}

	public void setColumnasGrilla(List<ColumnaGrillaMensajeRequest> columnasGrilla) {
		this.columnasGrilla = columnasGrilla;
	}
}
