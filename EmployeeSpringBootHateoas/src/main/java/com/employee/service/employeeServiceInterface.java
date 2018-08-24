package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.pojo.Employee;

public interface employeeServiceInterface {

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployee(int id);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp, int id);

	void deleteEmployee(int id);

}