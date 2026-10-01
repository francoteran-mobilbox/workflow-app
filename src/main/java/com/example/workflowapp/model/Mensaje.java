package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensaje")
public class Mensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mensaje")
	private Integer idMensaje;

	@Column(name = "activity_id")
	private Integer activityId;

	@Column(name = "asunto")
	private String asunto;

	@Column(name = "encabezado")
	private Boolean encabezado;

	@Column(name = "con_copia")
	private Boolean conCopia;

	@Column(name = "contenido")
	private String contenido;

	@Column(name = "envia_a_cargo")
	private Boolean enviaACargo;

	@Column(name = "envia_formulario_externo")
	private Boolean enviaFormularioExterno;

	public Mensaje() {
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Boolean getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Boolean encabezado) {
		this.encabezado = encabezado;
	}

	public Boolean getConCopia() {
		return conCopia;
	}

	public void setConCopia(Boolean conCopia) {
		this.conCopia = conCopia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
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
}
