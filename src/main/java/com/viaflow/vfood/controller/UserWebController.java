package com.viaflow.vfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.vfood.model.Usuario;
import com.viaflow.vfood.service.UsuarioService;
import com.viaflow.vfood.validation.BaseValidation;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*")
public class UserWebController extends BaseController<Usuario, UsuarioService, BaseValidation<Usuario>> {
	
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BaseValidation<Usuario> baseValidation;

	@Override
	protected UsuarioService getService() {
		return this.usuarioService;
	}

	@Override
	protected BaseValidation<Usuario> getValidation() {
		return this.baseValidation;
	}
}
