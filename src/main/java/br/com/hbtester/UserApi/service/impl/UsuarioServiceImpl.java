package br.com.hbtester.UserApi.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.hbtester.UserApi.model.Usuario;
import br.com.hbtester.UserApi.repositories.UsuarioRepository;
import br.com.hbtester.UserApi.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
