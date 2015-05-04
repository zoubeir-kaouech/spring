package tn.fst.mvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import tn.fst.mvc.persistance.Users;
@Repository
public class LoginUser implements ILoginUser {
	
	@PersistenceContext
	EntityManager em;
	@Override
	public Users authentification(String login) {
	Query query=em.createQuery("select u from Users u where u.login=:login");
	query.setParameter("login", login);
	
		return (Users) query.getSingleResult();
	}


}
