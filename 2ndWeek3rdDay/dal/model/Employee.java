package com.dal.model;

import java.io.Serializable;
import java.util.Comparator;

//POJO - Plain Old Java Object (No business logic)
public class Employee implements Serializable, Comparable<Employee> {
	private int eid;
	private String name;
	private String dept;
	@Override
	public int compareTo(Employee e) {
		System.out.println(this.eid);
		return this.eid - e.eid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
		

	};
}
