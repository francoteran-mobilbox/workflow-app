package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "condicion_visibilidad_proceso")
public class CondicionVisibilidadProceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_condicion_proceso")
	private Integer idCondicionProceso;

	@Column(name = "doc_comun_id_izq")
	private Integer docComunIdIzq;

	@Column(name = "id_metadato_izq")
	private Integer idMetadatoIzq;

	@Column(name = "codigo_bloq_izq")
	private String codigoBloqIzq;

	@Column(name = "id_metadato_der")
	private Integer idMetadatoDer;

	@Column(name = "codigo_bloq_der")
	private String codigoBloqDer;

	public CondicionVisibilidadProceso() {
	}

	public Integer getIdCondicionProceso() {
		return idCondicionProceso;
	}

	public void setIdCondicionProceso(Integer idCondicionProceso) {
		this.idCondicionProceso = idCondicionProceso;
	}

	public Integer getDocComunIdIzq() {
		return docComunIdIzq;
	}

	public void setDocComunIdIzq(Integer docComunIdIzq) {
		this.docComunIdIzq = docComunIdIzq;
	}

	public Integer getIdMetadatoIzq() {
		return idMetadatoIzq;
	}

	public void setIdMetadatoIzq(Integer idMetadatoIzq) {
		this.idMetadatoIzq = idMetadatoIzq;
	}

	public String getCodigoBloqIzq() {
		return codigoBloqIzq;
	}

	public void setCodigoBloqIzq(String codigoBloqIzq) {
		this.codigoBloqIzq = codigoBloqIzq;
	}

	public Integer getIdMetadatoDer() {
		return idMetadatoDer;
	}

	public void setIdMetadatoDer(Integer idMetadatoDer) {
		this.idMetadatoDer = idMetadatoDer;
	}

	public String getCodigoBloqDer() {
		return codigoBloqDer;
	}

	public void setCodigoBloqDer(String codigoBloqDer) {
		this.codigoBloqDer = codigoBloqDer;
	}
}
