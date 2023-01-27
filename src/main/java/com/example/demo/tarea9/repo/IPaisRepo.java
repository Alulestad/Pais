package com.example.demo.tarea9.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.tarea9.modelo.Pais;

import jakarta.transaction.Transactional;


public interface IPaisRepo {
	//CRUD
	public void insertar(Pais pais);
	public Pais buscar(Integer id);
	public void actualizar(Pais pais);
	public void eliminar(Integer id);
}
