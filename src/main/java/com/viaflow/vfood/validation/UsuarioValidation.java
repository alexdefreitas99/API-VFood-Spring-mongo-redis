package com.viaflow.vfood.validation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.vfood.model.Usuario;

public class UsuarioValidation implements BaseValidation<Usuario>{
	
	@Override
	public boolean validateObject(Usuario object, BindingResult result) {
		if (object.getNome() == null
				|| object.getNome().isEmpty()) {
			result.addError(new ObjectError("Usuario", "Field Name should be informed"));
		}
		return !result.hasErrors();
	}
}
