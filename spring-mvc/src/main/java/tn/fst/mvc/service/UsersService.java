package tn.fst.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fst.mvc.dao.IUserDAO;
import tn.fst.mvc.persistance.Users;
@Service("service")
public class UsersService implements IUserService {
	@Autowired
IUserDAO dao;
	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return dao.addUsers(users);
	}

	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return dao.updateUsers(users);
	}

	@Override
	public boolean deleteUsers(Users users) {
		// TODO Auto-generated method stub
		return dao.deleteUsers(users);
	}

	@Override
	public Users findUsersById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findUsersById(id);
	}



	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAllUsers();
	}

}
