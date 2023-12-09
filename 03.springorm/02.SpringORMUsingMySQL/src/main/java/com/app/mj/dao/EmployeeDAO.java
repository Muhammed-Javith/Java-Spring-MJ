package com.app.mj.dao;

//EmployeeDAO.java

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.mj.model.Employee;

@Repository
public class EmployeeDAO {

 @Autowired
 private SessionFactory sessionFactory;

 public void saveEmployee(Employee employee) {
     Session session = sessionFactory.getCurrentSession();
     session.save(employee);
 }

 public Employee getEmployeeById(int empId) {
     Session session = sessionFactory.getCurrentSession();
     return session.get(Employee.class, empId);
 }
}


