package com.viaflow.vfood.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import com.viaflow.vfood.model.Perfil;

@Component
public class PerfilValidation implements BaseValidation<Perfil>{

	@Override
	public boolean validateObject(Perfil object, BindingResult result) {
		if (object.getNome() == null
				|| object.getNome().isEmpty()) {
			result.addError(new ObjectError("Profile", "Field Name should be informed"));
		}
		return !result.hasErrors();
	}
}
