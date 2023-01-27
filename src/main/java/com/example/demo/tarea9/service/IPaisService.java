package com.example.demo.tarea9.service;

import com.example.demo.tarea9.modelo.Pais;

public interface IPaisService {

	public void agregar(Pais pais);
	public Pais buscar(Integer id);
	public void actualizar(Pais pais);
	public void eliminar(Integer id);
}
