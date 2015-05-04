package tn.fst.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tn.fst.mvc.persistance.Users;
import tn.fst.mvc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	List<Users> users;
	IUserService service;

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}
	@RequestMapping("/")
	public ModelAndView menu(){
		users = new ArrayList<Users>();
		users = service.findAllUsers();
		return new ModelAndView("allUsers", "users", users);
		
	}
	@RequestMapping(value = "/all")
	public ModelAndView doAllUsers() {
		users = new ArrayList<Users>();
		users = service.findAllUsers();
		return new ModelAndView("allUsers", "users", users);
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String doAddUser(Users users) {
		service.addUsers(users);
		return "redirect:all";
	}
@ModelAttribute("userBean")
	public Users newUser(){
	return new Users();
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editUser(@PathVariable Integer id) {
		Users users = service.findUsersById(id);
		return new ModelAndView("editUser", "user", users);

	}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String editUser(@RequestParam Integer id,@RequestParam String login,@RequestParam String pwd,@RequestParam String name) {
		Users users = service.findUsersById(id);
		users.setLogin(login);
		users.setName(name);
		users.setPwd(pwd);
		service.updateUsers(users);
		return "redirect:/user/all";

	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		Users users = service.findUsersById(id);
		service.deleteUsers(users);
		return "redirect:/user/all";

	}
}
