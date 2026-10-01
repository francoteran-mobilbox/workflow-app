package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensaje_grilla_cc")
public class MensajeGrillaCc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mensaje_grilla_cc")
	private Integer idMensajeGrillaCc;

	@Column(name = "id_metadato_dest_cc")
	private Integer idMetadatoDestCc;

	@Column(name = "id_grilla_metadato")
	private Integer idGrillaMetadato;

	@Column(name = "id_columna_grilla")
	private Integer idColumnaGrilla;

	@Column(name = "datafield")
	private String datafield;

	public MensajeGrillaCc() {
	}

	public Integer getIdMensajeGrillaCc() {
		return idMensajeGrillaCc;
	}

	public void setIdMensajeGrillaCc(Integer idMensajeGrillaCc) {
		this.idMensajeGrillaCc = idMensajeGrillaCc;
	}

	public Integer getIdMetadatoDestCc() {
		return idMetadatoDestCc;
	}

	public void setIdMetadatoDestCc(Integer idMetadatoDestCc) {
		this.idMetadatoDestCc = idMetadatoDestCc;
	}

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
