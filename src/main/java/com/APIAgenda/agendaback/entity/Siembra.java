package com.APIAgenda.agendaback.entity;

import java.io.Serializable;
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
@Table(name="AG_SIEMBRA")
public class Siembra implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4821885547438142544L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name="LAND")
	Finca land;
	
	@Column(name="BATCH")
	String batch; // LOTE
	
	@Column(name="GROOVE")
	Long groove; //SURCO
	
	//producto: String;
	
	@Column(name="VARIEDAD")
	String variedad; // tiene producto
	
	@Column(name="PLANTS")
	Long plants; //plantas
	
	@Column(name="YEAR")
	Long year;
	
	@Column(name="WEEK")
	Long week;
	
	@Column(name="DAY")
	Long day;
	
	@Column(name="AGRICULTOR_ID")
	Long agricultor_id;
	
	@Column(name="CODE")
	String code;
	
	@Column(name="LAND_CODE")
	String landCode; // código de finca
	
	@JoinColumn(name="SPREADSHEETS")
	@OneToMany(cascade=CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	List<Planilla> spreadsheets;
	
	//@JsonManagedReference
	//@JsonProperty("product")
	//@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy="spreadsheets", orphanRemoval = true)
	Producto product;
	//No mapeado
	
	@Column(name="AGREGAR")
	boolean agregar;   
	
	public Siembra() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Finca getLand() {
		return land;
	}

	public void setLand(Finca land) {
		this.land = land;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Long getGroove() {
		return groove;
	}

	public void setGroove(Long groove) {
		this.groove = groove;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public Long getPlants() {
		return plants;
	}

	public void setPlants(Long plants) {
		this.plants = plants;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public Long getWeek() {
		return week;
	}

	public void setWeek(Long week) {
		this.week = week;
	}

	public Long getDay() {
		return day;
	}

	public void setDay(Long day) {
		this.day = day;
	}

	public Long getAgricultor_id() {
		return agricultor_id;
	}

	public void setAgricultor_id(Long agricultor_id) {
		this.agricultor_id = agricultor_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLandCode() {
		return landCode;
	}

	public void setLandCode(String landCode) {
		this.landCode = landCode;
	}

	public List<Planilla> getSpreadsheets() {
		return spreadsheets;
	}

	public void setSpreadsheets(List<Planilla> spreadsheets) {
		this.spreadsheets = spreadsheets;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public boolean isAgregar() {
		return agregar;
	}

	public void setAgregar(boolean agregar) {
		this.agregar = agregar;
	}
	
	

}
