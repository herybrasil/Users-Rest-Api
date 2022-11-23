package br.com.hbtester.UserApi.service;

import br.com.hbtester.UserApi.model.Usuario;

public interface UsuarioService {

	Usuario findById(Integer id);
}
