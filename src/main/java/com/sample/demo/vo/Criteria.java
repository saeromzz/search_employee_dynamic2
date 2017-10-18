package com.sample.demo.vo;

import java.util.List;

public class Criteria {

	private String opt;
	private String keyword;
	private List<String> jobs;
	private List<Integer> depts;
	private Long minSalary;
	private Long maxSalary;
	private String beginDates;
	private String endDates;
	
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public List<String> getJobs() {
		return jobs;
	}
	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	public List<Integer> getDepts() {
		return depts;
	}
	public void setDepts(List<Integer> depts) {
		this.depts = depts;
	}
	public Long getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(Long minSalary) {
		this.minSalary = minSalary;
	}
	public Long getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(Long maxSalary) {
		this.maxSalary = maxSalary;
	}
	public String getBeginDates() {
		return beginDates;
	}
	public void setBeginDates(String beginDates) {
		this.beginDates = beginDates;
	}
	public String getEndDates() {
		return endDates;
	}
	public void setEndDates(String endDates) {
		this.endDates = endDates;
	}
	
	
	
	
}
