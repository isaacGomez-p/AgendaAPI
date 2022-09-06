package com.APIAgenda.agendaback.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="AG_NUMERO_PLANILLA")
public class NumeroPlanilla implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8766584229797999447L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long nSpreadsheetId;
	
	@Column(name="CREATION_DATE")
	Date creationDate;
	
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.EAGER)
	User user;

	@Column(name="CODE")
	String code;
	
	@JsonBackReference
	@JoinColumn(name="FK_PLANILLA")
	@OneToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	Planilla spreadsheets;
	//No mapeado
	
	@Column(name="AGREGAR")
	boolean agregar;
	
	public NumeroPlanilla() {
		
	}

	public Long getnSpreadsheetId() {
		return nSpreadsheetId;
	}

	public void setnSpreadsheetId(Long nSpreadsheetId) {
		this.nSpreadsheetId = nSpreadsheetId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Planilla getSpreadsheets() {
		return spreadsheets;
	}

	public void setSpreadsheets(Planilla spreadsheets) {
		this.spreadsheets = spreadsheets;
	}

	public boolean isAgregar() {
		return agregar;
	}

	public void setAgregar(boolean agregar) {
		this.agregar = agregar;
	}
	
	
}

