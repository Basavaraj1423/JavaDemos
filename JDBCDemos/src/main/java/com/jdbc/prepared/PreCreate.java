package com.jdbc.prepared;

import java.sql.*;

public class PreCreate {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
             PreparedStatement statement = connection.prepareStatement
                     ("create table cab(cabNumber int primary key, dropLoc varchar(20), pickUp varchar(20),pickUpTime time, pickUpDate date, driverName varchar(20))");
        ) {
            boolean result = statement.execute();
            System.out.println("Table Created : "+!result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
