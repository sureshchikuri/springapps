package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.PermissionEntity;
import com.entity.RoleEntity;
import com.service.PermissionManager;
import com.service.RoleManager;

@Controller
public class RoleController {

	@Autowired
	private RoleManager roleManager;

	@Autowired
	private PermissionManager permissionManager;

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}

	public void setPermissionManager(PermissionManager permissionManager) {
		this.permissionManager = permissionManager;
	}

	@RequestMapping(value="/role/",method=RequestMethod.GET)
	public String listRoles(ModelMap map) {

		map.addAttribute("role", new RoleEntity());
		map.addAttribute("roleList", roleManager.getAllRoles());
		return "editRolesList";
	}

	@RequestMapping(value="/role/reg",method=RequestMethod.GET)
	public String regRole(ModelMap map) {
		map.addAttribute("role", new RoleEntity());
		map.addAttribute("permissionList", permissionManager
				.getAllPermissions());
		return "addNewRole";
	}

	@RequestMapping(value="/role/persist",method=RequestMethod.POST)
	public String persistEmployee(
			@ModelAttribute(value = "role") RoleEntity role,
			BindingResult result) {
		for (int i = 0; i < role.getPid().length; i++) {
			PermissionEntity p = permissionManager
					.getPermission(role.getPid()[i]);
			role.addPermission(p);
		}
		roleManager.persistRole(role);
		return "redirect:/";

	}

	@RequestMapping(value="/role/delete{roleId}")
	public String deleteEmployee(@PathVariable("roleId") Integer roleId) {

		roleManager.deleteRole(roleId);
		return "redirect:/";

	}

	@RequestMapping(value="/role/get{roleId}")
	public String getRole(@PathVariable("roleId") Integer roleId,
			HttpServletResponse response) throws IOException {

		RoleEntity entity = roleManager.getRole(roleId);
		response.getOutputStream().write(entity.toString().getBytes());
		return null;
	}
}
