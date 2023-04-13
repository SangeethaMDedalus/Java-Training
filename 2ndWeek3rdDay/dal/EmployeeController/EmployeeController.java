package com.dal.EmployeeController;

import java.io.Serializable;
import java.util.*;

import com.dal.dao.EmployeeDao;
import com.dal.dao.EmployeeDaoImp;
import com.dal.model.Employee;

public class EmployeeController implements EmployeeInterface {
	Employee ec;
	List<Employee> empList = new ArrayList<Employee>();
	EmployeeDao db = new EmployeeDaoImp();
	public void addEmployee() {
		ec = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int id =sc.nextInt();
		ec.setEid(id);
		System.out.println("Enter EName");
		String name =sc.next();
		ec.setName(name);
		System.out.println("Enter Dept");
		String dept =sc.next();
		ec.setDept(dept);
		empList.add(ec);
		db.insertEmployee(ec);
		System.out.println("Employee Added successfully");
	}
	public void viewEmployee() {
		//System.out.println(ec.getEid());
		//System.out.println(ec.getName());
		//System.out.println("Object");
		
		//System.out.println("Employee Object"+ec);
		//Iterator i = empList.iterator();
		//while(i.hasNext()) {
		//	System.out.println(i.next());
		//}
		//empList.forEach(System.out::println);
		db.showEmployee();
		
		
	}
	public String getEmployeeName() {
		return ec.getName();
	}
	@Override
	public void sortByEid() {
		Collections.sort(empList);
		System.out.println("After sorting by EID");
		System.out.println(empList);
		
	}
	@Override
	public void sortByEname() {		
		Collections.sort(empList, Employee.NameComparator);
		System.out.println(empList);
	}
	@Override
	public void updateEmployee() {
		
		ec = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Eid of the employee to update");
		int id =sc.nextInt();
		ec.setEid(id);
		db.updateEmployee(ec);
		System.out.println("Employee details updated successfully!!!");
		
	}
	@Override
	public void deleteEmployee() {
		ec = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Eid of the employee which is to deleted");
		int id =sc.nextInt();
		ec.setEid(id);
		db.deleteEmployee(ec.getEid());
		System.out.println("Employee details deleted successfully!!!");
		
	}
	

}
