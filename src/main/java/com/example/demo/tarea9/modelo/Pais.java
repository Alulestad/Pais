package com.example.demo.tarea9.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pais")
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_pais")
	@SequenceGenerator(name = "seq_pais",sequenceName = "seq_pais",allocationSize = 1)
	@Column(name = "pais_id")
	private Integer id;
	@Column(name = "pais_nombre")
	private String nombre;
	@Column(name = "pais_capital")
	private String capital;
	
	@OneToOne(mappedBy = "pais",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Gobernante gobernante;

	//GETS y Sets
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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}


	public Gobernante getGobernante() {
		return gobernante;
	}

	public void setGobernante(Gobernante gobernante) {
		this.gobernante = gobernante;
	}
	
	
	
	
	
}
