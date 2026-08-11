package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grilla_metadato_documento")
public class GrillaMetadatoDocumento {

	@Id
	@Column(name = "id_grilla_metadato")
	private Integer idGrillaMetadato;

	@Column(name = "id_documento")
	private Integer idDocumento;

	@Column(name = "id_metadato")
	private Integer idMetadato;

	@Column(name = "id_bloque")
	private Integer idBloque;

	@Column(name = "es_seleccionable")
	private Boolean esSeleccionable;

	@Column(name = "formato_vista_impresion")
	private String formatoVistaImpresion;

	@Column(name = "referencia_registros")
	private Boolean referenciaRegistros;

	@Column(name = "permitir_scroll_horizontal")
	private Boolean permitirScrollHorizontal;

	@Column(name = "lista_distribucion_editable")
	private Boolean listaDistribucionEditable;

	@Column(name = "es_plan_proceso")
	private Boolean esPlanProceso;

	@Column(name = "id_proceso")
	private Integer idProceso;

	@Column(name = "limite_filas")
	private Integer limiteFilas;

	@Column(name = "tiene_regla_columna_obligatoria")
	private Boolean tieneReglaColumnaObligatoria;

	@Column(name = "tiene_regla_columna_habilitada")
	private Boolean tieneReglaColumnaHabilitada;

	public GrillaMetadatoDocumento() {
	}

	public Integer getIdGrillaMetadato() {
		return idGrillaMetadato;
	}

	public void setIdGrillaMetadato(Integer idGrillaMetadato) {
		this.idGrillaMetadato = idGrillaMetadato;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}

	public Boolean getEsSeleccionable() {
		return esSeleccionable;
	}

	public void setEsSeleccionable(Boolean esSeleccionable) {
		this.esSeleccionable = esSeleccionable;
	}

	public String getFormatoVistaImpresion() {
		return formatoVistaImpresion;
	}

	public void setFormatoVistaImpresion(String formatoVistaImpresion) {
		this.formatoVistaImpresion = formatoVistaImpresion;
	}

	public Boolean getReferenciaRegistros() {
		return referenciaRegistros;
	}

	public void setReferenciaRegistros(Boolean referenciaRegistros) {
		this.referenciaRegistros = referenciaRegistros;
	}

	public Boolean getPermitirScrollHorizontal() {
		return permitirScrollHorizontal;
	}

	public void setPermitirScrollHorizontal(Boolean permitirScrollHorizontal) {
		this.permitirScrollHorizontal = permitirScrollHorizontal;
	}

	public Boolean getListaDistribucionEditable() {
		return listaDistribucionEditable;
	}

	public void setListaDistribucionEditable(Boolean listaDistribucionEditable) {
		this.listaDistribucionEditable = listaDistribucionEditable;
	}

	public Boolean getEsPlanProceso() {
		return esPlanProceso;
	}

	public void setEsPlanProceso(Boolean esPlanProceso) {
		this.esPlanProceso = esPlanProceso;
	}

	public Integer getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public Integer getLimiteFilas() {
		return limiteFilas;
	}

	public void setLimiteFilas(Integer limiteFilas) {
		this.limiteFilas = limiteFilas;
	}

	public Boolean getTieneReglaColumnaObligatoria() {
		return tieneReglaColumnaObligatoria;
	}

	public void setTieneReglaColumnaObligatoria(Boolean tieneReglaColumnaObligatoria) {
		this.tieneReglaColumnaObligatoria = tieneReglaColumnaObligatoria;
	}

	public Boolean getTieneReglaColumnaHabilitada() {
		return tieneReglaColumnaHabilitada;
	}

	public void setTieneReglaColumnaHabilitada(Boolean tieneReglaColumnaHabilitada) {
		this.tieneReglaColumnaHabilitada = tieneReglaColumnaHabilitada;
	}
}