package com.viaflow.vfood.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.vfood.model.Usuario;
import com.viaflow.vfood.repository.UsuarioRepository;
import com.viaflow.vfood.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, UsuarioRepository> implements UsuarioService{

	@Autowired
	private UsuarioRepository repo;

	@Override
	protected UsuarioRepository getRepo() {
		return this.repo;
	}	
}
