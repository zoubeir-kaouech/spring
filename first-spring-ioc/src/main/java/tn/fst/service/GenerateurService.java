package tn.fst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.fst.generateur.IGenerateur;
@Service("service")
public class GenerateurService implements IGenerateurService {
	
@Autowired
@Qualifier("pdf")
	IGenerateur generateur;

	public void setGenerateur(IGenerateur generateur) {
		this.generateur = generateur;
	}

	public void statistiqueParJour() {
		String[][] stat = null;
		generateur.generer(stat);

	}

	public void statistiqueParSemaine() {
		String[][] stat = null;
		generateur.generer(stat);
	}

}
