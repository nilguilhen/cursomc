package com.nilton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilton.cursomc.domain.Cliente;
import com.nilton.cursomc.repositories.ClienteRepository;
import com.nilton.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService { //classe que é chamada pelo controlator rest no Resource e pede pro repository ir no banco fazer uma ação

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())); 
	}
}
