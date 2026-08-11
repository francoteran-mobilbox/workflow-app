package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timer_proceso")
public class TimerProceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_timer_proceso")
	private Integer idTimerProceso;

	@Column(name = "es_met_formulario")
	private Boolean esMetFormulario;

	@Column(name = "doc_comun_id")
	private Integer docComunId;

	@Column(name = "id_bloque")
	private Integer idBloque;

	@Column(name = "id_metadato")
	private Integer idMetadato;

	@Column(name = "es_dato_fijo")
	private Boolean esDatoFijo;

	@Column(name = "es_tiempo")
	private Boolean esTiempo;

	@Column(name = "dato_fijo")
	private String datoFijo;

	@Column(name = "id_unidad_tiempo")
	private String idUnidadTiempo;

	@Column(name = "es_fecha")
	private Boolean esFecha;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "hora")
	private String hora;

	public TimerProceso() {
	}

	public Integer getIdTimerProceso() {
		return idTimerProceso;
	}

	public void setIdTimerProceso(Integer idTimerProceso) {
		this.idTimerProceso = idTimerProceso;
	}

	public Boolean getEsMetFormulario() {
		return esMetFormulario;
	}

	public void setEsMetFormulario(Boolean esMetFormulario) {
		this.esMetFormulario = esMetFormulario;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
	}

	public Boolean getEsDatoFijo() {
		return esDatoFijo;
	}

	public void setEsDatoFijo(Boolean esDatoFijo) {
		this.esDatoFijo = esDatoFijo;
	}

	public Boolean getEsTiempo() {
		return esTiempo;
	}

	public void setEsTiempo(Boolean esTiempo) {
		this.esTiempo = esTiempo;
	}

	public String getDatoFijo() {
		return datoFijo;
	}

	public void setDatoFijo(String datoFijo) {
		this.datoFijo = datoFijo;
	}

	public String getIdUnidadTiempo() {
		return idUnidadTiempo;
	}

	public void setIdUnidadTiempo(String idUnidadTiempo) {
		this.idUnidadTiempo = idUnidadTiempo;
	}

	public Boolean getEsFecha() {
		return esFecha;
	}

	public void setEsFecha(Boolean esFecha) {
		this.esFecha = esFecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
