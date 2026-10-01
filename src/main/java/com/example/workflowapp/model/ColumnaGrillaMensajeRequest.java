package com.example.workflowapp.model;

public class ColumnaGrillaMensajeRequest {

	private Integer idGrillaMetadato;

	private Integer idColumnaGrilla;

	private String datafield;

	public Integer getIdGrillaMetadato() {
		return idGrillaMetadato;
	}

	public void setIdGrillaMetadato(Integer idGrillaMetadato) {
		this.idGrillaMetadato = idGrillaMetadato;
	}

	public Integer getIdColumnaGrilla() {
		return idColumnaGrilla;
	}

	public void setIdColumnaGrilla(Integer idColumnaGrilla) {
		this.idColumnaGrilla = idColumnaGrilla;
	}

	public String getDatafield() {
		return datafield;
	}

	public void setDatafield(String datafield) {
		this.datafield = datafield;
	}
}
