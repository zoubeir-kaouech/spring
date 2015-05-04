package tn.fst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fst.dao.IPersonneDAO;
import tn.fst.persistance.Employee;
@Service("personneService")
public class PersonneService implements IPersonneService {
	@Autowired
IPersonneDAO personneDAO;
	@Override
	public boolean addPersonne(Employee personne) {
		// TODO Auto-generated method stub
		return personneDAO.addPersonne(personne);
	}

	@Override
	public boolean updatePersonne(Employee personne) {
		// TODO Auto-generated method stub
		return personneDAO.updatePersonne(personne);
	}

	@Override
	public boolean deletePersonne(Employee personne) {
		// TODO Auto-generated method stub
		return personneDAO.deletePersonne(personne);
	}

	@Override
	public Employee findPersonneById(Integer idPersonne) {
		// TODO Auto-generated method stub
		return personneDAO.findPersonneById(idPersonne);
	}

	@Override
	public List<Employee> findAllPersonnes() {
		// TODO Auto-generated method stub
		return personneDAO.findAllPersonnes();
	}

}
