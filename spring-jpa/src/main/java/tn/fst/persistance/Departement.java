package tn.fst.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Departement
 *
 */
@Entity
@Table(name="t_departement")

public class Departement implements Serializable {

	
	private Integer id;
	private String name;
	private Date dateCreation;
	private static final long serialVersionUID = 1L;
	
	private List<Employee> employees;

	public Departement() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@Temporal(TemporalType.DATE)
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@OneToMany(mappedBy="departement")
	public List<Employee> getemployees() {
		return employees;
	}
	public void setemployees(List<Employee> employees) {
		this.employees = employees;
	}
   
}
