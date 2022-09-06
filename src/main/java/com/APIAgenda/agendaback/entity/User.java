package com.APIAgenda.agendaback.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="AG_USER")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5999101471492072180L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name="FIRST_NAME")
	String firstName;
	
	@Column(name="LAST_NAME")
	String lastName;
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="DOCUMENT")
	String document;
	
	@Column(name="STATUS")
	Long status;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="DEPT")
	String dept;
	
	@Column(name="CITY")
	String city; 
	
	@JoinColumn(name="PRODUCTS")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.PERSIST)
	List<Producto> products;
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Producto> getProducts() {
		return products;
	}

	public void setProducts(List<Producto> products) {
		this.products = products;
	}
	
	
}
