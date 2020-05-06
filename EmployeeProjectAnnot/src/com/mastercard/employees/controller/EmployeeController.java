package com.mastercard.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Employee1;
import com.mastercard.employees.exception.EmployeeServiceException;
import com.mastercard.employees.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity getEmployees() {

		List<Employee1> employeeList = null;
		try {

			employeeList = employeeService.getEmployees();
		} catch (EmployeeServiceException e) {
			return new ResponseEntity(e.getMessage, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(employeeList, HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity getEmployee(@PathVariable("empId") int id) {

		Employee1 employee1 = new Employee1();

		try {

			employee1 = employeeService.getEmployee(id);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(employee1, HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}/managers", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity getManager(@PathVariable("empId") int id) {

		Employee1 employee1 = new Employee1();

		try {

			employee1 = employeeService.getManager(id);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(employee1, HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}reportees", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity getReportees(@PathVariable("empId") int id) {

		List<Employee1> employeeList = null;
		try {

			employeeList = employeeService.getManagerReportees(id);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(employeeList, HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}/delete", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity deleteEmployee(@PathVariable("empId") int id) {

		Employee1 employee1 = new Employee1();

		try {

			employeeService.deleteEmployee(id);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity("employee deleted successfully!",
				HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.DELETE)
	public @ResponseBody
	ResponseEntity deleteEmployeeLocal(@PathVariable("empId") int id) {

		try {

			employeeService.deleteEmployee(id);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity("employee deleted successfully!",
				HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}/update/salary", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity updateEmployee(@PathVariable("empId") int id,
			@PathVariable("salary") Double salary) {

		try {

			Employee1 employee1 = new Employee1();
			employee1.setEmpId(id);
			employee1.setSalary(salary);
			employeeService.updateEmployee(employee1);
		} catch (EmployeeServiceException e) {

			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			return new ResponseEntity(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity("employee updated successfully!",
				HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	ResponseEntity updateEmployeeLocal(@PathVariable("empId") int id,
			@RequestBody Employee1 employee1) {

		try {

			employee1.setEmpId(id);
			employeeService.updateEmployee(employee1);
		} catch (EmployeeServiceException e) {

			// return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);

		} catch (Exception e) {

			// return new
			// ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		} finally {

		}
		return new ResponseEntity("employee deleted successfully!",
				HttpStatus.OK);
	}
}
