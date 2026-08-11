package com.example.workflowapp.model;

import java.time.LocalDateTime;

public interface ProcessSummary {

	Integer getProcessId();

	String getProcessName();

	Integer getVersion();

	Integer getIdPadre();

	Boolean getEsUltimaVersion();

	String getProcessDesc();

	String getTimeunitId();

	String getIdUsuarioCreador();

	Boolean getActive();

	Integer getStageTotal();

	Integer getResponsibleId();

	LocalDateTime getCreationDate();

	Integer getProcessTime();

	String getObservaciones();

	Integer getIdJornada();

	Integer getIdCalendario();

	Integer getIdFamilia();

	Boolean getEsInstanciable();

	Boolean getVisible();

	Boolean getExpedienteElectronico();

	Boolean getTieneDocumentosComunes();

	Boolean getAgregadoCatalogoFormularios();

	Boolean getPrivado();

	Boolean getCompartido();

	Boolean getDesactualizado();

	Boolean getBajaPrioridadGestion();

	Boolean getDistribucionRequerida();
}
