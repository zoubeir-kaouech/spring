package tn.fst.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity
@Table(name="t_projet")

public class Projet implements Serializable {

	
	private Integer id;
	private String nameProjet;
	private static final long serialVersionUID = 1L;

	public Projet() {
		super();
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	@Column(name="name_projet")
	public String getNameProjet() {
		return this.nameProjet;
	}

	public void setNameProjet(String nameProjet) {
		this.nameProjet = nameProjet;
	}
   
}
