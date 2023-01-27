package com.example.demo.tarea9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea9.modelo.Pais;
import com.example.demo.tarea9.repo.IPaisRepo;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
	private IPaisRepo iPaisRepo;
	
	@Override
	public void agregar(Pais pais) {
		this.iPaisRepo.insertar(pais);

	}

	@Override
	public Pais buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPaisRepo.buscar(id);
	}

	@Override
	public void actualizar(Pais pais) {
		// TODO Auto-generated method stub
		this.iPaisRepo.actualizar(pais);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPaisRepo.eliminar(id);
	}

}
