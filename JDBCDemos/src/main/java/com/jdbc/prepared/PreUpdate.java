package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
             PreparedStatement statement = connection.prepareStatement("update cab set driverName=? where cabNumber=?");
             Scanner scanner = new Scanner(System.in);
        ) {
            String driverName = scanner.next();
            int cabNumber = scanner.nextInt();
            statement.setString(1,driverName);
            statement.setInt(2,cabNumber);

            boolean result = statement.execute();
            System.out.println("Values Updated"+!result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
