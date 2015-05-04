package tn.fst.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity
@Table(name="t_employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="role")
//@DiscriminatorValue(value="emp")
public class Employee implements Serializable {

	
	private Integer id;
	private String name;
	private String lastName;
	private static final long serialVersionUID = 1L;
	
	private Departement departement;
	private Employee personne;

	public Employee() {
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
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}  
	@Column(name="last_name")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@ManyToOne
	@JoinColumn(name="departement")
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	@ManyToOne
	@JoinColumn(name="boss")
	public Employee getPersonne() {
		return personne;
	}
	public void setPersonne(Employee personne) {
		this.personne = personne;
	}
   
}
