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
@Table(name="AG_PRODUCTO")
public class Producto implements Serializable{

	private static final long serialVersionUID = -4357886151774684223L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long product_id;
	
	@Column(name="name")
	String name;
	
	@Column(name="VARIETY")
	String variety;
	
	@Column(name="CODE")
	String code;
	//No mapeado
	
	@Column(name="EDICION")
	boolean edicion;
	
	@Column(name="AGREGAR")
	boolean agregar;
	
	@ManyToOne(cascade= CascadeType.REFRESH, fetch = FetchType.EAGER)
	User user;
	
	public Producto() {
		
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

