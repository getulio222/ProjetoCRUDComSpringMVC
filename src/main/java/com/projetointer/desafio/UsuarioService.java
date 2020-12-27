package com.projetointer.desafio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;

	public List<Usuario> ListAll() {
		return repo.findAll();
	}

	public Usuario getUser(int id) {
		return repo.findById(id).get();
	}

	public void saveUser(Usuario usuario) {
		repo.save(usuario);
	}

	public void deleteUser(int id) {
		repo.deleteById(id);
	}

}
