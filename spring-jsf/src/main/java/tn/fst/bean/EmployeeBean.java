package tn.fst.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import tn.fst.persistance.Employee;
import tn.fst.service.IPersonneService;

@ManagedBean
@ViewScoped
public class EmployeeBean {
	@ManagedProperty(value="#{personneService}")
	IPersonneService personneService;
	public void setPersonneService(IPersonneService personneService) {
		this.personneService = personneService;
	}
	public IPersonneService getPersonneService() {
		return personneService;
	}
	private Employee employee=new Employee();
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	public String ajouterEmployee(){
		personneService.addPersonne(employee);
	
		employee=new Employee();
		return null;
	}

}
