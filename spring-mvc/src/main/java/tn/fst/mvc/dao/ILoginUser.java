package tn.fst.mvc.dao;

import tn.fst.mvc.persistance.Users;

public interface ILoginUser {
	 Users authentification(String login);
}
