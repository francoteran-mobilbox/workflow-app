package com.example.workflowapp.model;

public class CondicionVisibilidadRequest {

	private String nombreDocComun;

	private CondicionVisibilidadProceso condicion;

	public String getNombreDocComun() {
		return nombreDocComun;
	}

	public void setNombreDocComun(String nombreDocComun) {
		this.nombreDocComun = nombreDocComun;
	}

	public CondicionVisibilidadProceso getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionVisibilidadProceso condicion) {
		this.condicion = condicion;
	}
}