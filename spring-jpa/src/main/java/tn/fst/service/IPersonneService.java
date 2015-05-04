package tn.fst.service;

import java.util.List;

import tn.fst.persistance.Employee;

public interface IPersonneService {
	boolean addPersonne(Employee personne);
	boolean updatePersonne(Employee personne);
	boolean deletePersonne(Employee personne);
	Employee findPersonneById(Integer idPersonne);
	List<Employee> findAllPersonnes();
}
