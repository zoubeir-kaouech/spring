package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Todo;

/**
 * Created by ego on 05/04/15.
 */
@Service
@Transactional
public class TodoService {

	@PersistenceContext
	private EntityManager em;

	public TodoService() {
	}

	public Todo create(Todo todo) {
		em.persist(todo);
		return todo;
	}

	
	public Todo find(Long id) {
		return em.find(Todo.class, id);
	}

	public Todo update(Todo todo) {
		return em.merge(todo);
	}

	public void delete(Long id) {
		em.remove(em.find(Todo.class, id));
	}


	public List<Todo> findAll() {
		return em.createQuery("from Todo", Todo.class).getResultList();
	}
}
