package com.evaluaciondesempeno.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	private Long id;
	
	@Column
	private Long identificacion;

	
	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;
	
	@Column
	private int desempenoA;
	
	@Column
	private int factorhumanoA;
	
	@Column
	private int habilidadesA;
	
	@Column
	private int desempenoJ;
	
	@Column
	private int factorhumanoJ;
	
	@Column
	private int habilidadesJ;
	
	@Column
	private int desempenoC;
	
	@Column
	private int factorhumanoC;
	
	@Column
	private int habilidadesC;
	
	@NotEmpty
	private String cargo;

	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	public Empleado() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
		
	public int getDesempenoA() {
		return desempenoA;
	}

	public void setDesempenoA(int desempenoA) {
		this.desempenoA = desempenoA;
	}

	public int getFactorhumanoA() {
		return factorhumanoA;
	}

	public void setFactorhumanoA(int factorhumanoA) {
		this.factorhumanoA = factorhumanoA;
	}

	public int getHabilidadesA() {
		return habilidadesA;
	}

	public void setHabilidadesA(int habilidadesA) {
		this.habilidadesA = habilidadesA;
	}

	public int getDesempenoJ() {
		return desempenoJ;
	}

	public void setDesempenoJ(int desempenoJ) {
		this.desempenoJ = desempenoJ;
	}

	public int getFactorhumanoJ() {
		return factorhumanoJ;
	}

	public void setFactorhumanoJ(int factorhumanoJ) {
		this.factorhumanoJ = factorhumanoJ;
	}

	public int getHabilidadesJ() {
		return habilidadesJ;
	}

	public void setHabilidadesJ(int habilidadesJ) {
		this.habilidadesJ = habilidadesJ;
	}

	public int getDesempenoC() {
		return desempenoC;
	}

	public void setDesempenoC(int desempenoC) {
		this.desempenoC = desempenoC;
	}

	public int getFactorhumanoC() {
		return factorhumanoC;
	}

	public void setFactorhumanoC(int factorhumanoC) {
		this.factorhumanoC = factorhumanoC;
	}

	public int getHabilidadesC() {
		return habilidadesC;
	}

	public void setHabilidadesC(int habilidadesC) {
		this.habilidadesC = habilidadesC;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", identificacion=" + identificacion + ", nombre=" + nombre + ", apellido="
				+ apellido + ", desempenoA=" + desempenoA + ", factorhumanoA=" + factorhumanoA + ", habilidadesA="
				+ habilidadesA + ", desempenoJ=" + desempenoJ + ", factorhumanoJ=" + factorhumanoJ + ", habilidadesJ="
				+ habilidadesJ + ", desempenoC=" + desempenoC + ", factorhumanoC=" + factorhumanoC + ", habilidadesC="
				+ habilidadesC + ", cargo=" + cargo + ", fecha=" + fecha + "]";
	}


}
