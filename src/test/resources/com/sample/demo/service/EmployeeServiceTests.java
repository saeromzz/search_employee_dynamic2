package com.sample.demo.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/app-context.xml"})
public class EmployeeServiceTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSearchEmployees() {
		
		
		String opt = "name";
		String keyword = "Hong";
		
		List<Integer> depts = Arrays.asList(50, 60, 80, 90);
		List<String> jobs = Arrays.asList("AD_PRES", "AD_VP", "IT_PROG", "ST_CLERK");
		Long minSalary = new Long(3000);
		Long maxSalary = new Long(30000);
		String beginDates = "2002-07-01";
		String endDates = "2007-08-31";
		
		Criteria criteria = new Criteria();
		criteria.setOpt(opt);
		criteria.setKeyword(keyword);
		criteria.setDepts(depts);
		criteria.setJobs(jobs);
		criteria.setMinSalary(minSalary);
		criteria.setMaxSalary(maxSalary);
		criteria.setBeginDates(beginDates);
		criteria.setEndDates(endDates);
		
		List<Employee> result = employeeService.searchEmployees(criteria);
		Assert.assertEquals(1, result.size());
	}
}
