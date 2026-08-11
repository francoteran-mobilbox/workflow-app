package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "runningprocesses")
public class Runningprocess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "processrunning_id")
	private Integer processRunningId;

	@Column(name = "processrunning_name")
	private String processRunningName;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "invocador")
	private String invocador;

	@Column(name = "id_estado_ejecucion")
	private String idEstadoEjecucion;

	@Column(name = "processinstance_identifier", nullable = false)
	private String processInstanceIdentifier;

	@Column(name = "user_login_creator", nullable = false)
	private String userLoginCreator;

	@Column(name = "creation_date", nullable = false)
	private LocalDateTime creationDate;

	@Column(name = "limit_date")
	private LocalDateTime limitDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@Column(name = "end_date")
	private LocalDateTime endDate;

	@Column(name = "suspended")
	private Boolean suspended;

	@Column(name = "terminated")
	private Boolean terminated;

	@Column(name = "plazo_fijo")
	private Boolean plazoFijo;

	@Column(name = "tiempo_limite")
	private Integer tiempoLimite;

	@Column(name = "id_unidad_tiempo")
	private String idUnidadTiempo;

	@Column(name = "id_objeto")
	private String idObjeto;

	@Column(name = "es_sub_proceso")
	private Boolean esSubProceso;

	@Column(name = "id_expediente_electronico")
	private Integer idExpedienteElectronico;

	@Column(name = "nombre_cambiado_x_usuario")
	private Boolean nombreCambiadoXUsuario;

	@Column(name = "porcentaje_avance")
	private BigDecimal porcentajeAvance;

	@Column(name = "etapa_orden")
	private Integer etapaOrden;

	@Column(name = "process_name")
	private String processName;

	@Column(name = "eliminado")
	private Boolean eliminado;

	public Runningprocess() {
	}

	public Integer getProcessRunningId() {
		return processRunningId;
	}

	public void setProcessRunningId(Integer processRunningId) {
		this.processRunningId = processRunningId;
	}

	public String getProcessRunningName() {
		return processRunningName;
	}

	public void setProcessRunningName(String processRunningName) {
		this.processRunningName = processRunningName;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getInvocador() {
		return invocador;
	}

	public void setInvocador(String invocador) {
		this.invocador = invocador;
	}

	public String getIdEstadoEjecucion() {
		return idEstadoEjecucion;
	}

	public void setIdEstadoEjecucion(String idEstadoEjecucion) {
		this.idEstadoEjecucion = idEstadoEjecucion;
	}

	public String getProcessInstanceIdentifier() {
		return processInstanceIdentifier;
	}

	public void setProcessInstanceIdentifier(String processInstanceIdentifier) {
		this.processInstanceIdentifier = processInstanceIdentifier;
	}

	public String getUserLoginCreator() {
		return userLoginCreator;
	}

	public void setUserLoginCreator(String userLoginCreator) {
		this.userLoginCreator = userLoginCreator;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(LocalDateTime limitDate) {
		this.limitDate = limitDate;
	}

	public LocalDateTime getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(LocalDateTime modificationDate) {
		this.modificationDate = modificationDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Boolean getSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public Boolean getTerminated() {
		return terminated;
	}

	public void setTerminated(Boolean terminated) {
		this.terminated = terminated;
	}

	public Boolean getPlazoFijo() {
		return plazoFijo;
	}

	public void setPlazoFijo(Boolean plazoFijo) {
		this.plazoFijo = plazoFijo;
	}

	public Integer getTiempoLimite() {
		return tiempoLimite;
	}

	public void setTiempoLimite(Integer tiempoLimite) {
		this.tiempoLimite = tiempoLimite;
	}

	public String getIdUnidadTiempo() {
		return idUnidadTiempo;
	}

	public void setIdUnidadTiempo(String idUnidadTiempo) {
		this.idUnidadTiempo = idUnidadTiempo;
	}

	public String getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(String idObjeto) {
		this.idObjeto = idObjeto;
	}

	public Boolean getEsSubProceso() {
		return esSubProceso;
	}

	public void setEsSubProceso(Boolean esSubProceso) {
		this.esSubProceso = esSubProceso;
	}

	public Integer getIdExpedienteElectronico() {
		return idExpedienteElectronico;
	}

	public void setIdExpedienteElectronico(Integer idExpedienteElectronico) {
		this.idExpedienteElectronico = idExpedienteElectronico;
	}

	public Boolean getNombreCambiadoXUsuario() {
		return nombreCambiadoXUsuario;
	}

	public void setNombreCambiadoXUsuario(Boolean nombreCambiadoXUsuario) {
		this.nombreCambiadoXUsuario = nombreCambiadoXUsuario;
	}

	public BigDecimal getPorcentajeAvance() {
		return porcentajeAvance;
	}

	public void setPorcentajeAvance(BigDecimal porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}

	public Integer getEtapaOrden() {
		return etapaOrden;
	}

	public void setEtapaOrden(Integer etapaOrden) {
		this.etapaOrden = etapaOrden;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
}