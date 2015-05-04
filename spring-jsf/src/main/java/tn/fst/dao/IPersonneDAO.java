package tn.fst.dao;

import java.util.List;

import tn.fst.persistance.Employee;

public interface IPersonneDAO {
	
	boolean addPersonne(Employee personne);
	boolean updatePersonne(Employee personne);
	boolean deletePersonne(Employee personne);
	Employee findPersonneById(Integer idPersonne);
	List<Employee> findAllPersonnes();
}
