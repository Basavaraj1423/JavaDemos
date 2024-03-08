package com.jdbc.basics;

import java.sql.*;

public class SelectTable {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
             Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Employee");) {
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int employeeId = resultSet.getInt("employeeId");
                String city =resultSet.getString("City");
                System.out.println(name+"\t"+employeeId+"\t"+city);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}