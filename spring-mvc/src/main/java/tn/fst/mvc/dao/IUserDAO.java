package tn.fst.mvc.dao;

import java.util.List;

import tn.fst.mvc.persistance.Users;

public interface IUserDAO {
 boolean addUsers(Users users);
 boolean updateUsers(Users users);
 boolean deleteUsers(Users users);
 Users findUsersById(Integer id);

 List<Users> findAllUsers();
 
}
