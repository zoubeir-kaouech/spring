package tn.fst.generateur;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PDFGenerateur implements IGenerateur{
	public void generer(String[][] statistique) {
System.out.println("Rapport pdf......");
	}
}
