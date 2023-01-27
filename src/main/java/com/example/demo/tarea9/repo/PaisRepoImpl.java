package com.example.demo.tarea9.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.tarea9.modelo.Pais;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PaisRepoImpl implements IPaisRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Pais pais) {
		this.entityManager.persist(pais);

	}

	@Override
	public Pais buscar(Integer id) {
		Pais encontrado= this.entityManager.find(Pais.class, id);
		return encontrado;
	}

	@Override
	public void actualizar(Pais pais) {
		this.entityManager.merge(pais);

	}

	@Override
	public void eliminar(Integer id) {
		Pais aEliminar= this.buscar(id);
		this.entityManager.remove(aEliminar);

	}

}
