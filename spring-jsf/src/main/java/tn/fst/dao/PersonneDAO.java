package tn.fst.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.fst.persistance.Employee;

@Repository(value="dao")
@Transactional
public class PersonneDAO implements IPersonneDAO {
	@PersistenceContext(unitName = "spring-jsf")
	EntityManager em;

	@Override
	public boolean addPersonne(Employee personne) {

		try {
			em.persist(personne);
			personne.setName("foulen1");
		} catch (Exception exception) {
			return false;
		}
		return true;
	}

	@Override
	public boolean updatePersonne(Employee personne) {
		try {
			em.merge(personne);
		} catch (Exception exception) {
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePersonne(Employee personne) {
		try {

			em.remove(em.merge(personne));
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Employee findPersonneById(Integer idPersonne) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, idPersonne);
	}

	@Override
	public List<Employee> findAllPersonnes() {
		Query query = em.createQuery("select e from Employee e");
	
		return query.getResultList();
	}

}
