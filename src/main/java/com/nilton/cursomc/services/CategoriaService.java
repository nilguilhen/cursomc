package com.nilton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilton.cursomc.domain.Categoria;
import com.nilton.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService { //classe que é chamada pelo controlator rest no Resource e pede pro repository ir no banco fazer uma ação

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
}
