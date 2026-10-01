package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class DatoMecanismoRequest {

	private Integer idMecanismoDenominacion;

	private List<DatoReqProcesoRequest> datosRequeridos = Collections.emptyList();

	public Integer getIdMecanismoDenominacion() {
		return idMecanismoDenominacion;
	}

	public void setIdMecanismoDenominacion(Integer idMecanismoDenominacion) {
		this.idMecanismoDenominacion = idMecanismoDenominacion;
	}

	public List<DatoReqProcesoRequest> getDatosRequeridos() {
		return datosRequeridos;
	}

	public void setDatosRequeridos(List<DatoReqProcesoRequest> datosRequeridos) {
		this.datosRequeridos = datosRequeridos;
	}
}