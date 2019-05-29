package com.stackroute.jdbcdemo;

import java.sql.*;

public class DataManager {
    public void getAllStudents()  {
        //register driver
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
        Connection connection=DriverManager.getConnection("jdbc:mysql:// localhost:3306/student","root","Root@123");
         Statement statement=connection. createStatement();
        ResultSet resultSet=statement.executeQuery("select * from student");
        while(resultSet.next()) {
           /* String id = resultSet.getString(1);*/
            String name = resultSet.getString(2);
           /* System.out.println(id);*/
            System.out.println(name);
        }
        }
        catch (ClassNotFoundException e ){
            System.out.println("exception thrown"+e.getStackTrace());
        }
        catch(SQLException sqlexception){
            System.out.println("sql exception"+sqlexception.getStackTrace());
        }
    }
}
