package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.EmployeeDaoI;
import com.capgemini.entity.Employee;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	private EmployeeDaoI dao;

	@Override
	public void updateEmployee(Employee e) {
		dao.updateEmployee(e);
	}
}
