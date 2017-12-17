package br.com.relojoaria.bomtempo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.relojoaria.bomtempo.models.ObjetoComData;

@Component
public class DateValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Object.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
//		ObjetoComData objetoComData = (ObjetoComData) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome","", "O nome está vazio!!!");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data","", "A data está vazio!!!");
		
//		if(objetoComData.getNome().length()<5){
//			errors.rejectValue("nome", "", "Nome está com menos de 5 caracteres!!!");
//		}
	}

}
