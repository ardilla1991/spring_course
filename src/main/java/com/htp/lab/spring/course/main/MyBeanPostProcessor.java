package com.htp.lab.spring.course.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object object, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String arg1) throws BeansException {
		System.out.println(object + " postProcessBeforeInitialization() ");
		return object;
	}

}
