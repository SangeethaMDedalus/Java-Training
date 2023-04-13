package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dal.jdbc.MyDBConnection;
import com.dal.model.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	@Override
	public void insertEmployee(Employee emp) {
		con  = MyDBConnection.getDbConnection();
		try {
			con = MyDBConnection.getDbConnection();
			ps= con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1,emp.getEid());
			ps.setString(2, emp.getName());
			ps.setString(3,emp.getDept());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void showEmployee() {
		con  = MyDBConnection.getDbConnection();
		try {
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void updateEmployee(Employee emp) {
		con = MyDBConnection.getDbConnection();
		try {
			ps= con.prepareStatement("update employee set dept='admin' where empid=?");
			ps.setInt(1, emp.getEid());
			ps.executeUpdate();
	
			//System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void deleteEmployee(int eid) {
		con = MyDBConnection.getDbConnection();
		try {
			ps= con.prepareStatement("delete from employee where empid=?");
			ps.setInt(1,eid);
			ps.executeUpdate();
	
			//System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
