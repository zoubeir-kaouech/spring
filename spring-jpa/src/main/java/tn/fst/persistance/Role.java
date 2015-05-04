package tn.fst.persistance;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity
@Table(name = "t_role")
public class Role implements Serializable {

	private String role;
	private RolePK rolePk;
	private static final long serialVersionUID = 1L;

	private Projet projet;
	private Developpeur developpeur;

	@ManyToOne
	@JoinColumn(name = "id_projet", insertable = false, updatable = false)
	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	@ManyToOne
	@JoinColumn(name = "id_developpeur", insertable = false, updatable = false)
	public Developpeur getDeveloppeur() {
		return developpeur;
	}

	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}

	public Role() {
		super();
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@EmbeddedId
	public RolePK getRolePk() {
		return this.rolePk;
	}

	public void setRolePk(RolePK rolePk) {
		this.rolePk = rolePk;
	}

}
