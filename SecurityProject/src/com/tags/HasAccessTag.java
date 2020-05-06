package com.tags;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.TagSupport;

import com.entity.PermissionEntity;
import com.entity.RoleEntity;
import com.entity.UserEntity;

public class HasAccessTag extends TagSupport {

	String pageOper;

	public void setPageOper(String pageOper) {
		this.pageOper = pageOper;
	}

	@Override
	public int doEndTag() {

		try {
			if (pageOper != null) {
				UserEntity user = (UserEntity) pageContext.getSession().getAttribute("user");
				if (user != null) {
					Set<RoleEntity> roles = user.getRoles();

					if (pageOper != null && roles != null) {
						Iterator<RoleEntity> itr = roles.iterator();
						boolean hasAccess = false;
						while (itr.hasNext()) {
							RoleEntity roleEntity = itr.next();
							Iterator<PermissionEntity> permissionItr = roleEntity
									.getPermissions().iterator();
							while (permissionItr.hasNext()) {
								PermissionEntity permission = permissionItr
										.next();
								if (permission.getName().equals(pageOper))
									hasAccess = true;
							}
							if (hasAccess)
								break;
						}
						if (!hasAccess)
							((HttpServletResponse) pageContext.getResponse())
									.sendRedirect("unauthorized.jsp");
					}
				} else {
					((HttpServletResponse) pageContext.getResponse())
							.sendRedirect("login.jsp");
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return EVAL_PAGE;
	}
}
