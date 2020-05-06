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
import com.service.PermissionManager;

@Controller
public class PermissionController {

	@Autowired
	private PermissionManager permissionManager;
	
	public void setPermissionManager(PermissionManager permissionManager) {
		this.permissionManager = permissionManager;
	}
	
@RequestMapping(value="/permission/reg",method=RequestMethod.GET)
	public String regPermission(ModelMap map) {
		map.addAttribute("permisson", new PermissionEntity());
		
		return "addPermission";
	}

@RequestMapping(value="/permission/persist",method=RequestMethod.POST)
	public String persistPermission(
			@ModelAttribute(value = "permission") PermissionEntity permission,
			BindingResult result) {
			 permissionManager
					.persistPermission(permission);
		return "redirect:/";
	}

@RequestMapping(value="/permission/delete{pid}")
	public String deleteEmployee(@PathVariable("pId") Integer pid) {

		permissionManager.deletePermission(pid);
		return "redirect:/";

	}

@RequestMapping(value="/permission/get{permissionId}")
	public String getPermission(@PathVariable("permissionId") Integer permissionId,
			HttpServletResponse response) throws IOException {

		PermissionEntity entity = permissionManager.getPermission(permissionId);
		response.getOutputStream().write(entity.toString().getBytes());
		return null;
	}

}
