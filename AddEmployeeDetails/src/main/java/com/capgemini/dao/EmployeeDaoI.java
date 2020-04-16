package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.Employee;

public interface EmployeeDaoI extends JpaRepository<Employee, Integer>{

	

}
