package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoI{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Employee fetchEmployee(int id) {
		Employee e = em.find(Employee.class, id);
		return e;
	}
}
