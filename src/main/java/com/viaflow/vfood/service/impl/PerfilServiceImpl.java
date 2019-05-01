package com.viaflow.vfood.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.vfood.model.Perfil;
import com.viaflow.vfood.repository.PerfilRepository;
import com.viaflow.vfood.service.PerfilService;

@Service
public class PerfilServiceImpl extends BaseServiceImpl<Perfil, PerfilRepository> implements PerfilService{

	@Autowired
	private PerfilRepository repo;

	@Override
	protected PerfilRepository getRepo() {
		return this.repo;
	}	
}
