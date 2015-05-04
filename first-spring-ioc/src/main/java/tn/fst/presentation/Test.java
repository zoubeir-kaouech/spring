package tn.fst.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.fst.service.IGenerateurService;

public class Test {

	public static void main(String[] args) {
IGenerateurService service;
ApplicationContext context = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
service=(IGenerateurService) context.getBean("service");
service.statistiqueParJour();
	}

}
