package tn.fst.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.fst.mvc.persistance.Users;
@Repository
@Transactional
public class UsersDAO implements IUserDAO {
@PersistenceContext
EntityManager em;
	@Override
	public boolean addUsers(Users users) {
		em.persist(users);
		return true;
	}

	@Override
	public boolean updateUsers(Users users) {
		em.merge(users);
		return true;
	}

	@Override
	public boolean deleteUsers(Users users) {
		em.remove(em.merge(users));
		return true;
	}

	@Override
	public Users findUsersById(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Users.class, id);
	}

	
	@Override
	public List<Users> findAllUsers() {
		Query query=em.createQuery("select u from Users u" );
		
		return query.getResultList();
	}

}
