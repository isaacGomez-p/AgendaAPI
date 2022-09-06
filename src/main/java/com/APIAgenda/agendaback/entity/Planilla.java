package com.APIAgenda.agendaback.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="AG_PLANILLA")
public class Planilla implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4794509684641535624L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long spreadsheetId;
	
	@Column(name="FILING_DATE")
	Date filingDate; //Fecha de formulación
	
	@Column(name="LOTE")
	String lote;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="ACTIVITY")
	String activity;
	
	@Column(name="CONTROL")
	String control;
	
	@Column(name="PREVENTION")
	String prevention;

	@Column(name="FERTILIZATION")
	String fertilization; 
	
	@Column(name="DOSE")
	Long dose;
	
	@Column(name="TOTAL_MIX")
	Long totalMix;
	
	@Column(name="TOTAL_DOSE")
	Long totalDose;

	@Column(name="MADE_BY")
	String madeBy;
	
	@Column(name="APPLICATION_DATE")
	Date applicationDate;
	
	@Column(name="STATUS")
	String status;
	
	@Column(name="QUALITY")
	String quality;
	
	@Column(name="CODE")
	String code;
	
	@Column(name="CODE_N_SPREADSHEET")
	String codeNSpreadsheet;
	
	@Column(name="CODE_LAND")
	String codeLand;
	
	@JoinColumn(name="PLANTING_MAPS")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.PERSIST)
	List<Siembra> plantingMaps;
	
	@Column(name="PRODUCTO")
	String producto;
	
	@Column(name="LAND_ID")
	Long landId;
	
	@Column(name="AGRICULTOR_ID")
	Long agricultor_id;
	
	@JsonManagedReference
	@JsonProperty("nSpreadsheet")
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy="spreadsheets", orphanRemoval = true)
	NumeroPlanilla nSpreadsheet;
	
	//No mapeadas
	@Column(name="FINCA_NOMBRE")
	String fincaNombre;
	
	@Column(name="AGREGAR")
	boolean agregar;
	
	@Column(name="FECHA_STRING")
	String fechaString;
	
	@Column(name="FECHA_APLICACION_STRING")
	String fechaAplicacionString;
	
	public Planilla() {
		
	}

	public Long getSpreadsheetId() {
		return spreadsheetId;
	}

	public void setSpreadsheetId(Long spreadsheetId) {
		this.spreadsheetId = spreadsheetId;
	}

	public Date getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(Date filingDate) {
		this.filingDate = filingDate;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getPrevention() {
		return prevention;
	}

	public void setPrevention(String prevention) {
		this.prevention = prevention;
	}

	public String getFertilization() {
		return fertilization;
	}

	public void setFertilization(String fertilization) {
		this.fertilization = fertilization;
	}

	public Long getDose() {
		return dose;
	}

	public void setDose(Long dose) {
		this.dose = dose;
	}

	public Long getTotalMix() {
		return totalMix;
	}

	public void setTotalMix(Long totalMix) {
		this.totalMix = totalMix;
	}

	public Long getTotalDose() {
		return totalDose;
	}

	public void setTotalDose(Long totalDose) {
		this.totalDose = totalDose;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeNSpreadsheet() {
		return codeNSpreadsheet;
	}

	public void setCodeNSpreadsheet(String codeNSpreadsheet) {
		this.codeNSpreadsheet = codeNSpreadsheet;
	}

	public String getCodeLand() {
		return codeLand;
	}

	public void setCodeLand(String codeLand) {
		this.codeLand = codeLand;
	}

	public List<Siembra> getPlantingMaps() {
		return plantingMaps;
	}

	public void setPlantingMaps(List<Siembra> plantingMaps) {
		this.plantingMaps = plantingMaps;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Long getLandId() {
		return landId;
	}

	public void setLandId(Long landId) {
		this.landId = landId;
	}

	public Long getAgricultor_id() {
		return agricultor_id;
	}

	public void setAgricultor_id(Long agricultor_id) {
		this.agricultor_id = agricultor_id;
	}

	public NumeroPlanilla getnSpreadsheet() {
		return nSpreadsheet;
	}

	public void setnSpreadsheet(NumeroPlanilla nSpreadsheet) {
		this.nSpreadsheet = nSpreadsheet;
	}

	public String getFincaNombre() {
		return fincaNombre;
	}

	public void setFincaNombre(String fincaNombre) {
		this.fincaNombre = fincaNombre;
	}

	public boolean isAgregar() {
		return agregar;
	}

	public void setAgregar(boolean agregar) {
		this.agregar = agregar;
	}

	public String getFechaString() {
		return fechaString;
	}

	public void setFechaString(String fechaString) {
		this.fechaString = fechaString;
	}

	public String getFechaAplicacionString() {
		return fechaAplicacionString;
	}

	public void setFechaAplicacionString(String fechaAplicacionString) {
		this.fechaAplicacionString = fechaAplicacionString;
	}
	
	
}

