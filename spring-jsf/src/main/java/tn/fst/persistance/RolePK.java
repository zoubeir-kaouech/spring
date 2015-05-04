package tn.fst.persistance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class RolePK implements Serializable{
	private Integer idProjet;
	private Integer idDeveloppeur;
	@Column(name="id_projet")
	public Integer getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}
	@Column(name="id_developpeur")
	public Integer getIdDeveloppeur() {
		return idDeveloppeur;
	}
	public void setIdDeveloppeur(Integer idDeveloppeur) {
		this.idDeveloppeur = idDeveloppeur;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idDeveloppeur == null) ? 0 : idDeveloppeur.hashCode());
		result = prime * result
				+ ((idProjet == null) ? 0 : idProjet.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolePK other = (RolePK) obj;
		if (idDeveloppeur == null) {
			if (other.idDeveloppeur != null)
				return false;
		} else if (!idDeveloppeur.equals(other.idDeveloppeur))
			return false;
		if (idProjet == null) {
			if (other.idProjet != null)
				return false;
		} else if (!idProjet.equals(other.idProjet))
			return false;
		return true;
	}
	

}
