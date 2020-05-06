package cm.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vcs.command.Employee;

public class EmployeeController extends MultiActionController {

	public ModelAndView insert(HttpServletRequest request,
			HttpServletResponse response,Employee employee) throws Exception {

		System.out.println("insert");
		
		return new ModelAndView("success");
	}
}
