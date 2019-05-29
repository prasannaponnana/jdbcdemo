package com.stackroute;

import com.stackroute.jdbcdemo.DataManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();
    }
}
