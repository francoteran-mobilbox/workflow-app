package com.example.workflowapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "processes")
public class WorkflowProcess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "process_name", nullable = false)
	private String processName;

	@Column(name = "version", nullable = false)
	private Integer version;

	@Column(name = "id_padre")
	private Integer idPadre;

	@Column(name = "es_ultima_version")
	private Boolean esUltimaVersion;

	@JsonIgnore
	@Column(name = "path")
	private String path;

	@Column(name = "process_desc")
	private String processDesc;

	@Column(name = "timeunit_id")
	private String timeunitId;

	@Column(name = "id_usuario_creador")
	private String idUsuarioCreador;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "stage_total")
	private Integer stageTotal;

	@Column(name = "responsible_id")
	private Integer responsibleId;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "process_time")
	private Integer processTime;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "id_jornada")
	private Integer idJornada;

	@Column(name = "id_calendario")
	private Integer idCalendario;

	@Column(name = "id_familia")
	private Integer idFamilia;

	@Column(name = "es_instanciable")
	private Boolean esInstanciable;

	@Column(name = "visible")
	private Boolean visible;

	@Column(name = "expediente_electronico")
	private Boolean expedienteElectronico;

	@Column(name = "tiene_documentos_comunes")
	private Boolean tieneDocumentosComunes;

	@Column(name = "agregado_catalogo_formularios")
	private Boolean agregadoCatalogoFormularios;

	@Column(name = "privado")
	private Boolean privado;

	@Column(name = "compartido")
	private Boolean compartido;

	@Column(name = "desactualizado")
	private Boolean desactualizado;

	@Column(name = "baja_prioridad_gestion")
	private Boolean bajaPrioridadGestion;

	@Column(name = "distribucion_requerida")
	private Boolean distribucionRequerida;

	public WorkflowProcess() {
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

	public Boolean getEsUltimaVersion() {
		return esUltimaVersion;
	}

	public void setEsUltimaVersion(Boolean esUltimaVersion) {
		this.esUltimaVersion = esUltimaVersion;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public String getTimeunitId() {
		return timeunitId;
	}

	public void setTimeunitId(String timeunitId) {
		this.timeunitId = timeunitId;
	}

	public String getIdUsuarioCreador() {
		return idUsuarioCreador;
	}

	public void setIdUsuarioCreador(String idUsuarioCreador) {
		this.idUsuarioCreador = idUsuarioCreador;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getStageTotal() {
		return stageTotal;
	}

	public void setStageTotal(Integer stageTotal) {
		this.stageTotal = stageTotal;
	}

	public Integer getResponsibleId() {
		return responsibleId;
	}

	public void setResponsibleId(Integer responsibleId) {
		this.responsibleId = responsibleId;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getProcessTime() {
		return processTime;
	}

	public void setProcessTime(Integer processTime) {
		this.processTime = processTime;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getIdJornada() {
		return idJornada;
	}

	public void setIdJornada(Integer idJornada) {
		this.idJornada = idJornada;
	}

	public Integer getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(Integer idCalendario) {
		this.idCalendario = idCalendario;
	}

	public Integer getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(Integer idFamilia) {
		this.idFamilia = idFamilia;
	}

	public Boolean getEsInstanciable() {
		return esInstanciable;
	}

	public void setEsInstanciable(Boolean esInstanciable) {
		this.esInstanciable = esInstanciable;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Boolean getExpedienteElectronico() {
		return expedienteElectronico;
	}

	public void setExpedienteElectronico(Boolean expedienteElectronico) {
		this.expedienteElectronico = expedienteElectronico;
	}

	public Boolean getTieneDocumentosComunes() {
		return tieneDocumentosComunes;
	}

	public void setTieneDocumentosComunes(Boolean tieneDocumentosComunes) {
		this.tieneDocumentosComunes = tieneDocumentosComunes;
	}

	public Boolean getAgregadoCatalogoFormularios() {
		return agregadoCatalogoFormularios;
	}

	public void setAgregadoCatalogoFormularios(Boolean agregadoCatalogoFormularios) {
		this.agregadoCatalogoFormularios = agregadoCatalogoFormularios;
	}

	public Boolean getPrivado() {
		return privado;
	}

	public void setPrivado(Boolean privado) {
		this.privado = privado;
	}

	public Boolean getCompartido() {
		return compartido;
	}

	public void setCompartido(Boolean compartido) {
		this.compartido = compartido;
	}

	public Boolean getDesactualizado() {
		return desactualizado;
	}

	public void setDesactualizado(Boolean desactualizado) {
		this.desactualizado = desactualizado;
	}

	public Boolean getBajaPrioridadGestion() {
		return bajaPrioridadGestion;
	}

	public void setBajaPrioridadGestion(Boolean bajaPrioridadGestion) {
		this.bajaPrioridadGestion = bajaPrioridadGestion;
	}

	public Boolean getDistribucionRequerida() {
		return distribucionRequerida;
	}

	public void setDistribucionRequerida(Boolean distribucionRequerida) {
		this.distribucionRequerida = distribucionRequerida;
	}
}
