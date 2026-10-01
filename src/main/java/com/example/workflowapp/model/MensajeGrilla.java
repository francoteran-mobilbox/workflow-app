package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensaje_grilla")
public class MensajeGrilla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mensaje_grilla")
	private Integer idMensajeGrilla;

	@Column(name = "id_metadato_dest_mensaje")
	private Integer idMetadatoDestMensaje;

	@Column(name = "id_grilla_metadato")
	private Integer idGrillaMetadato;

	@Column(name = "id_columna_grilla")
	private Integer idColumnaGrilla;

	@Column(name = "datafield")
	private String datafield;

	public MensajeGrilla() {
	}

	public Integer getIdMensajeGrilla() {
		return idMensajeGrilla;
	}

	public void setIdMensajeGrilla(Integer idMensajeGrilla) {
		this.idMensajeGrilla = idMensajeGrilla;
	}

	public Integer getIdMetadatoDestMensaje() {
		return idMetadatoDestMensaje;
	}

	public void setIdMetadatoDestMensaje(Integer idMetadatoDestMensaje) {
		this.idMetadatoDestMensaje = idMetadatoDestMensaje;
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
