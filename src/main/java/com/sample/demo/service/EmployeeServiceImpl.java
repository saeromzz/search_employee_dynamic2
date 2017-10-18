package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.mappers.EmployeeMapper;
import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> searchEmployees(Criteria criteria) {
		if (criteria == null) {
			throw new IllegalArgumentException("null은 안돼염~"); 
		}
		return employeeMapper.searchEmployees(criteria);
	}
}
