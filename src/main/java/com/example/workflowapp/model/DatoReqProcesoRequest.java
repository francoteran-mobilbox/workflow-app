package com.example.workflowapp.model;

public class DatoReqProcesoRequest {

	private DatoReqProceso dato;

	private MetadatoReqProceso metadatoRequerido;

	private String nombreDocumentoComun;

	public DatoReqProceso getDato() {
		return dato;
	}

	public void setDato(DatoReqProceso dato) {
		this.dato = dato;
	}

	public MetadatoReqProceso getMetadatoRequerido() {
		return metadatoRequerido;
	}

	public void setMetadatoRequerido(MetadatoReqProceso metadatoRequerido) {
		this.metadatoRequerido = metadatoRequerido;
	}

	public String getNombreDocumentoComun() {
		return nombreDocumentoComun;
	}

	public void setNombreDocumentoComun(String nombreDocumentoComun) {
		this.nombreDocumentoComun = nombreDocumentoComun;
	}
}