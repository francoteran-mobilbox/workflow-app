package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class TransicionRequest {

	private Transition transicion;

	private String idActividadOrigen;

	private String idActividadDestino;

	private List<ReglaUsuario> reglasUsuario = Collections.emptyList();

	private List<ReglaNegocioRequest> reglasNegocio = Collections.emptyList();

	private Boolean tieneTimer;

	private TimerProceso timer;

	private Boolean conInterrupcion;

	public Transition getTransicion() {
		return transicion;
	}

	public void setTransicion(Transition transicion) {
		this.transicion = transicion;
	}

	public String getIdActividadOrigen() {
		return idActividadOrigen;
	}

	public void setIdActividadOrigen(String idActividadOrigen) {
		this.idActividadOrigen = idActividadOrigen;
	}

	public String getIdActividadDestino() {
		return idActividadDestino;
	}

	public void setIdActividadDestino(String idActividadDestino) {
		this.idActividadDestino = idActividadDestino;
	}

	public List<ReglaUsuario> getReglasUsuario() {
		return reglasUsuario;
	}

	public void setReglasUsuario(List<ReglaUsuario> reglasUsuario) {
		this.reglasUsuario = reglasUsuario;
	}

	public List<ReglaNegocioRequest> getReglasNegocio() {
		return reglasNegocio;
	}

	public void setReglasNegocio(List<ReglaNegocioRequest> reglasNegocio) {
		this.reglasNegocio = reglasNegocio;
	}

	public Boolean getTieneTimer() {
		return tieneTimer;
	}

	public void setTieneTimer(Boolean tieneTimer) {
		this.tieneTimer = tieneTimer;
	}

	public TimerProceso getTimer() {
		return timer;
	}

	public void setTimer(TimerProceso timer) {
		this.timer = timer;
	}

	public Boolean getConInterrupcion() {
		return conInterrupcion;
	}

	public void setConInterrupcion(Boolean conInterrupcion) {
		this.conInterrupcion = conInterrupcion;
	}
}