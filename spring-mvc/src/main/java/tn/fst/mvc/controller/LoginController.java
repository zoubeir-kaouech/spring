package tn.fst.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tn.fst.mvc.persistance.Users;
import tn.fst.mvc.service.IUserService;

@Controller
public class LoginController {

	@ModelAttribute("users")
	public Users createToDoBean() {
		return new Users();
	}
	List<Users> users;
	IUserService service;

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}

	@RequestMapping("/login")
	public ModelAndView getLoginForm(Users users,
			@RequestParam(value = "error", required = false) String error,

			@RequestParam(value = "logout", required = false) String logout) {

		String message = "";
		if (error != null) {
			message = "Incorrect username or password !";

		} else if (logout != null) {
			message = "Logout successful !";

	
		}
		return new ModelAndView("login", "message", message);

	}

}
