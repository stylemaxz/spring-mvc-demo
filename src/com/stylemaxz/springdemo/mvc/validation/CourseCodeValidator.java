package com.stylemaxz.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator 
	implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrfix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrfix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		
		if(theCode != null){
			result =  theCode.startsWith(coursePrfix);
		}else {
			result = true;
		}
		return result;
	}

}
