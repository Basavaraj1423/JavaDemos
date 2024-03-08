package com.jdbc.prepared;

import java.sql.*;

//"create table cab(cabNumber int primary key, dropLoc varchar(20)" +
//        ", pickUp varchar(20),pickUpTime time, pickUpDate date, driverName varchar(20))

public class PreSelectWhere {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
             PreparedStatement statement = connection.prepareStatement("Select * from Cab where pickUp=?");

        ) {
            statement.setString(1, "SLK");
            try (
                    ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cabNumber");
                    String dropLoc = resultSet.getString("dropLoc");
                    String pickUp = resultSet.getString("pickUp");
                    String pickUpTime = resultSet.getString("pickUpTime");
                    String pickUpDate = resultSet.getString("pickUpDate");
                    String driverName = resultSet.getString("driverName");
                    System.out.println(cabNumber + "        " + "\t" + dropLoc + "          " + "\t" + pickUp + "          " + "\t" + pickUpTime + "           " + "\t" + "          " + pickUpDate + "          " + "\t" + driverName);

                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
