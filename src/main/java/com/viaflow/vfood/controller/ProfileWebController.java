package com.viaflow.vfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.vfood.model.Perfil;
import com.viaflow.vfood.service.PerfilService;
import com.viaflow.vfood.validation.BaseValidation;

@RestController
@RequestMapping("/api/perfil")
@CrossOrigin(origins = "*")
public class ProfileWebController extends BaseController<Perfil, PerfilService, BaseValidation<Perfil>> {

	@Autowired
	private PerfilService perfilService;

	@Autowired
	private BaseValidation<Perfil> baseValidation;

	@Override
	protected PerfilService getService() {
		return this.perfilService;
	}

	@Override
	protected BaseValidation<Perfil> getValidation() {
		return this.baseValidation;
	}
}
