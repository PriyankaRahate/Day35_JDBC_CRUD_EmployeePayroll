package com.JDBC.Bridgelabz.Day35_CRUD_EmployeePayroll;

import java.sql.*;
import java.util.Enumeration;


public class JDBCEmployeePayroll {
   
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("cannot find driver in classpath", e);
        }
        listDrivers();
        try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll_service?useSSL=false", "root",
                    "Mujawar#1118");
            System.out.println("Connection Done..!!!" + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    public static void listDrivers() {
        
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println(" " + driverClass.getClass().getName());
        }
    }
}