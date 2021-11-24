package co.edu.utadeo.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "pastel")
public class Pastel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nombre;
	
	@Column(length = 8, nullable=false)
	private Integer peso;
	
	/**
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "fecha_inicio", nullable=false)	
	private Date fechaInicio;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "fecha_fin", nullable=false)
	private Date fechaFin; */
	
	@Column(length = 200)
	private String especificaciones;
	
	@Column(length = 200)
	private String descripcion;
	
	@Column(length = 50)
	private String pastelero;
	
	@Column(length=16000)
	private String img;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	/*public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
*/
	public String getEspecificaciones() {
		return especificaciones;
	}

	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPastelero() {
		return pastelero;
	}

	public void setPastelero(String pastelero) {
		this.pastelero = pastelero;
	}

	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	
	public Pastel(Integer id, String nombre, Integer peso, String especificaciones,
			String descripcion, String pastelero, String img) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		//this.fechaInicio = fechaInicio;
		//this.fechaFin = fechaFin;
		this.especificaciones = especificaciones;
		this.descripcion = descripcion;
		this.pastelero = pastelero;
		this.img = img;
	}

	public Pastel() {
		super();
	}
	
	
}
