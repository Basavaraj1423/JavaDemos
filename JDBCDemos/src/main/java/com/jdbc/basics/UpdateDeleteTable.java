package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteTable {
    public static void main(String[] args) {
        //Creating the connection Object
        try (
                //Creating the connection Object.
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
                //Create Statement Object so that you can use Execute method.
                Statement statement = connection.createStatement();) {
            //use execute to pass the querry that needs to be executed
            boolean result1 = statement.execute("update employee set city='Mysore'");
            // boolean result2 = statement.execute("Alter table employee drop column city");
            System.out.println("Updated " + !result1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
