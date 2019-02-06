package com.marqueburgess.employeeapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marqueburgess.employeeapp.model.Employee;
import com.marqueburgess.employeeapp.model.Response;

@RestController
public class EmpController {

	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public Response employeeAdd(@RequestParam(value = "id") Integer id, @RequestParam(value = "name") String name,
			@RequestParam(value = "yearWorked") Integer yearWorked, @RequestParam(value = "salary") Double salary) {
		Employee emp = new Employee(id, name, yearWorked, salary);
		employees.put(emp.getEmployeeId(), emp);
		return new Response(counter.incrementAndGet(), emp);
	}

	@RequestMapping(value = "/findemployee", method = RequestMethod.GET)
	@ResponseBody
	public Employee employeefind(@RequestParam(value = "id") Integer id) {

		return employees.get(id);
	}

	@RequestMapping(value = "/removeemployee", method = RequestMethod.GET)
	@ResponseBody
	public Employee employeeDelete(@RequestParam(value = "id") Integer id) {

		return employees.remove(id);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	@ResponseBody
	public Employee[] employeeAll() {

		Set<Integer> ids = employees.keySet();
		Employee[] emp = new Employee[ids.size()];
		int i = 0;
		for (Integer id : ids) {
			emp[i] = employees.get(id);
			i++;
		}

		return emp;
	}

}
