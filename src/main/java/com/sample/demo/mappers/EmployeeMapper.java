package com.sample.demo.mappers;

import java.util.List;
import java.util.Map;

import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

public interface EmployeeMapper {

	List<Employee> searchEmployees(Criteria criteria);

}
