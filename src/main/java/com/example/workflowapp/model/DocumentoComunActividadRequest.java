package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class DocumentoComunActividadRequest {

	private String nombreDocComunProceso;

	private DocumentoComunActividad documentoComunActividad;

	private List<MetaDisponiblesActividad> metadatosDisponibles = Collections.emptyList();

	private ReglaDocumentoMultiple reglaMultiFormulario;

	private List<MetadatoTransferidoActividad> metadatosTransferidos = Collections.emptyList();

	public String getNombreDocComunProceso() {
		return nombreDocComunProceso;
	}

	public void setNombreDocComunProceso(String nombreDocComunProceso) {
		this.nombreDocComunProceso = nombreDocComunProceso;
	}

	public DocumentoComunActividad getDocumentoComunActividad() {
		return documentoComunActividad;
	}

	public void setDocumentoComunActividad(DocumentoComunActividad documentoComunActividad) {
		this.documentoComunActividad = documentoComunActividad;
	}

	public List<MetaDisponiblesActividad> getMetadatosDisponibles() {
		return metadatosDisponibles;
	}

	public void setMetadatosDisponibles(List<MetaDisponiblesActividad> metadatosDisponibles) {
		this.metadatosDisponibles = metadatosDisponibles;
	}

	public ReglaDocumentoMultiple getReglaMultiFormulario() {
		return reglaMultiFormulario;
	}

	public void setReglaMultiFormulario(ReglaDocumentoMultiple reglaMultiFormulario) {
		this.reglaMultiFormulario = reglaMultiFormulario;
	}

	public List<MetadatoTransferidoActividad> getMetadatosTransferidos() {
		return metadatosTransferidos;
	}

	public void setMetadatosTransferidos(List<MetadatoTransferidoActividad> metadatosTransferidos) {
		this.metadatosTransferidos = metadatosTransferidos;
	}
}