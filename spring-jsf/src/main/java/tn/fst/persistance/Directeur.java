package tn.fst.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.fst.persistance.Employee;

/**
 * Entity implementation class for Entity: Directeur
 *
 */
@Entity
//@DiscriminatorValue(value="dir")
public class Directeur extends Employee implements Serializable {

	
	private String cin;
	private static final long serialVersionUID = 1L;

	public Directeur() {
		super();
	}   
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
   
}
