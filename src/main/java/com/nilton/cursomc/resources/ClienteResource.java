package com.nilton.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nilton.cursomc.domain.Cliente;
import com.nilton.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource { //controlador rest que comunica atraves dos endpoints com a aplicação do cliente

	@Autowired
	private ClienteService service;
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Cliente obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
