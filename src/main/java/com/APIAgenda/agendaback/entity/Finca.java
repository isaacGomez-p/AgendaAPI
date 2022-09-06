package com.APIAgenda.agendaback.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AG_FINCA")
public class Finca implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4592485334242621125L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long landId;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="STATUS")
	Long status;
	
	@ManyToOne(cascade=CascadeType.REFRESH, fetch = FetchType.EAGER)
	User user;
	
	@Column(name="CODE")
	String code;
	
	//No mapeado
	@Column(name="EDICION")
	boolean edicion;
	
	@Column(name="AGREGAR")
	boolean agregar;
	
	public Finca() {
		
	}

	public Long getLandId() {
		return landId;
	}

	public void setLandId(Long landId) {
		this.landId = landId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
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

	public boolean isEdicion() {
		return edicion;
	}

	public void setEdicion(boolean edicion) {
		this.edicion = edicion;
	}

	public boolean isAgregar() {
		return agregar;
	}

	public void setAgregar(boolean agregar) {
		this.agregar = agregar;
	}
	
	
}

