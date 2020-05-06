package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.RoleEntity;
import com.entity.UserEntity;
import com.service.RoleManager;
import com.service.UserManager;

@Controller
public class UserController {

	@Autowired
	private RoleManager roleManager;

	@Autowired
	private UserManager userManager;

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@RequestMapping(value="/userList",method=RequestMethod.GET)
	public String listUsers(ModelMap map) {

		map.addAttribute("user", new UserEntity());
		map.addAttribute("userList", userManager.getAllUsers());
		return "editRolesList";
	}

	@RequestMapping(value="/user/reg",method=RequestMethod.GET)
	public String regUser(ModelMap map) {
		map.addAttribute("user", new UserEntity());
		map.addAttribute("roleList", roleManager.getAllRoles());
		return "regUser";
	}

	@RequestMapping(value="/user/persist",method=RequestMethod.POST)
	public String persistEmployee(
			@ModelAttribute(value = "user") UserEntity user,
			BindingResult result) {
		for (int i = 0; i < user.getRoleIds().length; i++) {
			RoleEntity role = roleManager.getRole(user.getRoleIds()[i]);
			user.addRole(role);
		}
		userManager.persistUser(user);
		return "redirect:/userList";

	}

	@RequestMapping(value="/user/delete{userId}")
	public String deleteEmployee(@PathVariable("userId") Integer userId) {

		userManager.deleteUser(userId);
		return "redirect:/userList";

	}

	@RequestMapping(value="/user/get{userId}")
	public String getUser(@PathVariable("userId") Integer userId,
			HttpServletResponse response) throws IOException {

		UserEntity entity = userManager.getUser(userId);
		response.getOutputStream().write(entity.toString().getBytes());
		return null;
	}

	@RequestMapping(value="/user/logi",method=RequestMethod.POST)
	public String login(HttpServletRequest request) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserEntity user = userManager.login(username, password);

		request.getSession().setAttribute("user", user);
		return "redirect:/welcome.jsp";
	}
}
