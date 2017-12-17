package br.com.relojoaria.bomtempo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class DateValidator2 implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Object.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dataHome","", "A data está vazio!!!");
		
	}

}
