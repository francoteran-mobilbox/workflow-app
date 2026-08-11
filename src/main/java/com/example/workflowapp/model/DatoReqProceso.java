package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dato_req_proceso")
public class DatoReqProceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dato_req_proceso")
	private Integer idDatoReqProceso;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "id_dato_req_mecanismo")
	private Integer idDatoReqMecanismo;

	@Column(name = "id_dato_disponible_proceso", length = 3)
	private String idDatoDisponibleProceso;

	@Column(name = "valor_texto_fijo")
	private String valorTextoFijo;

	@Column(name = "nombre_secuencia")
	private String nombreSecuencia;

	public DatoReqProceso() {
	}

	public Integer getIdDatoReqProceso() {
		return idDatoReqProceso;
	}

	public void setIdDatoReqProceso(Integer idDatoReqProceso) {
		this.idDatoReqProceso = idDatoReqProceso;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getIdDatoReqMecanismo() {
		return idDatoReqMecanismo;
	}

	public void setIdDatoReqMecanismo(Integer idDatoReqMecanismo) {
		this.idDatoReqMecanismo = idDatoReqMecanismo;
	}

	public String getIdDatoDisponibleProceso() {
		return idDatoDisponibleProceso;
	}

	public void setIdDatoDisponibleProceso(String idDatoDisponibleProceso) {
		this.idDatoDisponibleProceso = idDatoDisponibleProceso;
	}

	public String getValorTextoFijo() {
		return valorTextoFijo;
	}

	public void setValorTextoFijo(String valorTextoFijo) {
		this.valorTextoFijo = valorTextoFijo;
	}

	public String getNombreSecuencia() {
		return nombreSecuencia;
	}

	public void setNombreSecuencia(String nombreSecuencia) {
		this.nombreSecuencia = nombreSecuencia;
	}
}
