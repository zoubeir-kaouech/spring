package tn.fst.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.fst.persistance.Directeur;
import tn.fst.persistance.Employee;
import tn.fst.service.IPersonneService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Employee personne=new Directeur();
		personne.setName("foulen");
		personne.setLastName("Bne foulen");
		IPersonneService service=context.getBean(IPersonneService.class);
		service.addPersonne(personne);

	}

}
