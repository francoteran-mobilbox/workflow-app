package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_externo_activity")
public class RegistroExternoActivity {

	@Id
	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "doc_comun_id")
	private Integer docComunId;

	@Column(name = "usa_doc_actual")
	private Boolean usaDocActual;

	public RegistroExternoActivity() {
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public Boolean getUsaDocActual() {
		return usaDocActual;
	}

	public void setUsaDocActual(Boolean usaDocActual) {
		this.usaDocActual = usaDocActual;
	}
}
