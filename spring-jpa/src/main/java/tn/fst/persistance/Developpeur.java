package tn.fst.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.fst.persistance.Employee;

/**
 * Entity implementation class for Entity: Developpeur
 *
 */
@Entity

public class Developpeur extends Employee implements Serializable {

	
	private String matricule;
	private static final long serialVersionUID = 1L;

	public Developpeur() {
		super();
	}   
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
   
}
