package com.example.demo.tarea9.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "gobernante")
public class Gobernante {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gobe")
	@SequenceGenerator(name = "seq_gobe",sequenceName = "seq_gobe",allocationSize = 1)
	@Column(name = "gobe_id")
	private Integer id;
	@Column(name = "gobe_nombre")
	private String nombre;
	@Column(name = "gobe_apellido")
	private String apellido;

	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gobe_id_pais")
	private Pais pais;

	//Gets y sets
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	
}
