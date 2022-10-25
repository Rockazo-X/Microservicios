package com.formacionbdi.springboot.app.productos.models.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Productos")
@ApiModel("Model Producto")
public class Producto implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Corresponde al id del producto", required = true)
	private Long id;

	@NotEmpty
	@ApiModelProperty(value = "Corresponde al nombre del producto", required = true)
	private String nombre;

	@NotNull
	@ApiModelProperty(value = "Corresponde al precio del producto", required = true)
	private Double precio;

	@NotNull
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@ApiModelProperty(value = "Corresponde a la fecha en que se creo el producto", required = true)
	private Date createAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Producto{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", precio=" + precio +
				", createAt=" + createAt +
				'}';
	}
}
