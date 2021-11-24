package co.edu.utadeo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable=false)
	private String nombre;
	
	@Column(length = 8, nullable = false)
	private Integer salario;
	
	@Column(length = 50, nullable=false)
	private String tipo;
	
	@Column(length = 10, nullable = false)
	private Integer pasaporte;
	
	@Column(length = 50, nullable = false)
	private String pais;

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

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Integer pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Empleado(Integer id, String nombre, Integer salario, String tipo, Integer pasaporte, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.tipo = tipo;
		this.pasaporte = pasaporte;
		this.pais = pais;
	}

	public Empleado() {
		super();
	}
	
	
}
