package com.app.mj.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.mj.dao.EmployeeDAO;
import com.app.mj.model.Employee;

@Service
@Transactional
public class EmployeeService {

 @Autowired
 private EmployeeDAO employeeDAO;

 public void saveEmployee(Employee emp) {
     employeeDAO.saveEmployee(emp);
 }

 public Employee getEmployeeById(int empId) {
     return employeeDAO.getEmployeeById(empId);
 }
}
