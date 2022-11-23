package br.com.hbtester.UserApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hbtester.UserApi.model.Usuario;
import br.com.hbtester.UserApi.service.UsuarioService;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id){	
		return ResponseEntity.ok().body(service.findById(id));
	}
}
