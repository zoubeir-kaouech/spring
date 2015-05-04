package tn.fst.generateur;

import org.springframework.stereotype.Component;

@Component("html")
public class HTMLGenerateur implements IGenerateur {
	public void generer(String[][] statistique) {
System.out.println("Rapport html......");
	}
}
