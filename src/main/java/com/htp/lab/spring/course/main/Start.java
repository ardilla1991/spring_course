package com.htp.lab.spring.course.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htp.lab.spring.course.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		//t1000.fire();
		System.out.println(t1000.getHand());
		
		/*t1000 = (ModelT1000) context.getBean("t1000Empty");
		System.out.println(t1000.getHand());*/
	}
}
