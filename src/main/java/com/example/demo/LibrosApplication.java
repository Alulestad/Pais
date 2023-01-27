package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea9.modelo.Gobernante;
import com.example.demo.tarea9.modelo.Pais;
import com.example.demo.tarea9.service.IPaisService;

@SpringBootApplication
public class LibrosApplication implements CommandLineRunner{

	@Autowired
	private IPaisService iPaisService;
	
	
	public static void main(String[] args){
		SpringApplication.run(LibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Pais pa1=new Pais();
		pa1.setCapital("La Habana");
		pa1.setNombre("Cuba");
		
		
		Gobernante gob1=new Gobernante();
		gob1.setNombre("Miguel");
		gob1.setApellido("Díaz-Canel");
		
		pa1.setGobernante(gob1);
		
		
		iPaisService.agregar(pa1);
		
		pa1.setNombre("Republica de Cuba");
		iPaisService.actualizar(pa1);
		
		System.out.println("capital del pais es: "+iPaisService.buscar(pa1.getId()).getCapital()); 
		
		iPaisService.eliminar(pa1.getId());
		
		
	}

}
