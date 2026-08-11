package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "activities")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "activity_id")
	private Integer activityId;

	@Column(name = "activity_name")
	private String activityName;

	@Column(name = "activitytype_id")
	private String activitytypeId;

	@Column(name = "priority_id")
	private Integer priorityId;

	@Column(name = "activity_desc")
	private String activityDesc;

	@Column(name = "activity_time")
	private Integer activityTime;

	@Column(name = "timeunit_id")
	private String timeunitId;

	@Column(name = "stage")
	private Integer stage;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "funcionality")
	private String funcionality;

	@Column(name = "cantidad_documentos")
	private Integer cantidadDocumentos;

	@Column(name = "adjuntar_documento")
	private Boolean adjuntarDocumento;

	@Column(name = "id_jornada")
	private Integer idJornada;

	@Column(name = "id_calendario")
	private Integer idCalendario;

	@Column(name = "id_rol")
	private Integer idRol;

	@Column(name = "minimo_ejecutores")
	private Integer minimoEjecutores;

	@Column(name = "cualquier_usuario")
	private Boolean cualquierUsuario;

	@Column(name = "id_elemento")
	private String idElemento;

	@Column(name = "tiene_documentos_comunes")
	private Boolean tieneDocumentosComunes;

	@Column(name = "validacion_jerarquica")
	private Boolean validacionJerarquica;

	@Column(name = "tiene_checkpoint")
	private Boolean tieneCheckpoint;

	@Column(name = "nombre_checkpoint", length = 255)
	private String nombreCheckpoint;

	@Column(name = "porcentaje_avance")
	private BigDecimal porcentajeAvance;

	@Column(name = "etapa_orden")
	private Integer etapaOrden;

	@Column(name = "tiene_alertas")
	private Boolean tieneAlertas;

	@Column(name = "imprime_formulario")
	private Boolean imprimeFormulario;

	@Column(name = "tarea_web")
	private Boolean tareaWeb;

	@Column(name = "filtrar_por_metadato")
	private Boolean filtrarPorMetadato;

	@Column(name = "registros_externos")
	private Boolean registrosExternos;

	@Column(name = "tiene_notificacion")
	private Boolean tieneNotificacion;

	@Column(name = "consecutiva")
	private Boolean consecutiva;

	@Column(name = "automatica")
	private Boolean automatica;

	@Column(name = "conservar_vistos_buenos")
	private Boolean conservarVistosBuenos;

	@Column(name = "es_timer")
	private Boolean esTimer;

	@Column(name = "utiliza_agenda")
	private Boolean utilizaAgenda;

	@Column(name = "dispositivo_movil")
	private Boolean dispositivoMovil;

	@Column(name = "tarea_externa_crea_usuario")
	private Boolean tareaExternaCreaUsuario;

	@Column(name = "tiene_destinatario_externo")
	private Boolean tieneDestinatarioExterno;

	@Column(name = "es_configuracion")
	private Boolean esConfiguracion;

	public Activity() {
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivitytypeId() {
		return activitytypeId;
	}

	public void setActivitytypeId(String activitytypeId) {
		this.activitytypeId = activitytypeId;
	}

	public Integer getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	public String getActivityDesc() {
		return activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public Integer getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Integer activityTime) {
		this.activityTime = activityTime;
	}

	public String getTimeunitId() {
		return timeunitId;
	}

	public void setTimeunitId(String timeunitId) {
		this.timeunitId = timeunitId;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getFuncionality() {
		return funcionality;
	}

	public void setFuncionality(String funcionality) {
		this.funcionality = funcionality;
	}

	public Integer getCantidadDocumentos() {
		return cantidadDocumentos;
	}

	public void setCantidadDocumentos(Integer cantidadDocumentos) {
		this.cantidadDocumentos = cantidadDocumentos;
	}

	public Boolean getAdjuntarDocumento() {
		return adjuntarDocumento;
	}

	public void setAdjuntarDocumento(Boolean adjuntarDocumento) {
		this.adjuntarDocumento = adjuntarDocumento;
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

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public Integer getMinimoEjecutores() {
		return minimoEjecutores;
	}

	public void setMinimoEjecutores(Integer minimoEjecutores) {
		this.minimoEjecutores = minimoEjecutores;
	}

	public Boolean getCualquierUsuario() {
		return cualquierUsuario;
	}

	public void setCualquierUsuario(Boolean cualquierUsuario) {
		this.cualquierUsuario = cualquierUsuario;
	}

	public String getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(String idElemento) {
		this.idElemento = idElemento;
	}

	public Boolean getTieneDocumentosComunes() {
		return tieneDocumentosComunes;
	}

	public void setTieneDocumentosComunes(Boolean tieneDocumentosComunes) {
		this.tieneDocumentosComunes = tieneDocumentosComunes;
	}

	public Boolean getValidacionJerarquica() {
		return validacionJerarquica;
	}

	public void setValidacionJerarquica(Boolean validacionJerarquica) {
		this.validacionJerarquica = validacionJerarquica;
	}

	public Boolean getTieneCheckpoint() {
		return tieneCheckpoint;
	}

	public void setTieneCheckpoint(Boolean tieneCheckpoint) {
		this.tieneCheckpoint = tieneCheckpoint;
	}

	public String getNombreCheckpoint() {
		return nombreCheckpoint;
	}

	public void setNombreCheckpoint(String nombreCheckpoint) {
		this.nombreCheckpoint = nombreCheckpoint;
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

	public Boolean getTieneAlertas() {
		return tieneAlertas;
	}

	public void setTieneAlertas(Boolean tieneAlertas) {
		this.tieneAlertas = tieneAlertas;
	}

	public Boolean getImprimeFormulario() {
		return imprimeFormulario;
	}

	public void setImprimeFormulario(Boolean imprimeFormulario) {
		this.imprimeFormulario = imprimeFormulario;
	}

	public Boolean getTareaWeb() {
		return tareaWeb;
	}

	public void setTareaWeb(Boolean tareaWeb) {
		this.tareaWeb = tareaWeb;
	}

	public Boolean getFiltrarPorMetadato() {
		return filtrarPorMetadato;
	}

	public void setFiltrarPorMetadato(Boolean filtrarPorMetadato) {
		this.filtrarPorMetadato = filtrarPorMetadato;
	}

	public Boolean getRegistrosExternos() {
		return registrosExternos;
	}

	public void setRegistrosExternos(Boolean registrosExternos) {
		this.registrosExternos = registrosExternos;
	}

	public Boolean getTieneNotificacion() {
		return tieneNotificacion;
	}

	public void setTieneNotificacion(Boolean tieneNotificacion) {
		this.tieneNotificacion = tieneNotificacion;
	}

	public Boolean getConsecutiva() {
		return consecutiva;
	}

	public void setConsecutiva(Boolean consecutiva) {
		this.consecutiva = consecutiva;
	}

	public Boolean getAutomatica() {
		return automatica;
	}

	public void setAutomatica(Boolean automatica) {
		this.automatica = automatica;
	}

	public Boolean getConservarVistosBuenos() {
		return conservarVistosBuenos;
	}

	public void setConservarVistosBuenos(Boolean conservarVistosBuenos) {
		this.conservarVistosBuenos = conservarVistosBuenos;
	}

	public Boolean getEsTimer() {
		return esTimer;
	}

	public void setEsTimer(Boolean esTimer) {
		this.esTimer = esTimer;
	}

	public Boolean getUtilizaAgenda() {
		return utilizaAgenda;
	}

	public void setUtilizaAgenda(Boolean utilizaAgenda) {
		this.utilizaAgenda = utilizaAgenda;
	}

	public Boolean getDispositivoMovil() {
		return dispositivoMovil;
	}

	public void setDispositivoMovil(Boolean dispositivoMovil) {
		this.dispositivoMovil = dispositivoMovil;
	}

	public Boolean getTareaExternaCreaUsuario() {
		return tareaExternaCreaUsuario;
	}

	public void setTareaExternaCreaUsuario(Boolean tareaExternaCreaUsuario) {
		this.tareaExternaCreaUsuario = tareaExternaCreaUsuario;
	}

	public Boolean getTieneDestinatarioExterno() {
		return tieneDestinatarioExterno;
	}

	public void setTieneDestinatarioExterno(Boolean tieneDestinatarioExterno) {
		this.tieneDestinatarioExterno = tieneDestinatarioExterno;
	}

	public Boolean getEsConfiguracion() {
		return esConfiguracion;
	}

	public void setEsConfiguracion(Boolean esConfiguracion) {
		this.esConfiguracion = esConfiguracion;
	}
}
