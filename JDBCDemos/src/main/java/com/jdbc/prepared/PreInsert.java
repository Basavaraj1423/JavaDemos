package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;
//(cab_number int primary key, drop_loc varchar(20), pick_up varchar(20),
// pickup_time timestamp, pickup_date date, driver_name varchar(20))
public class PreInsert {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
             PreparedStatement statement = connection.prepareStatement("insert into cab values (?,?,?,?,?,?)");
        ) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickUp = scanner.next();
                String time =scanner.next();
                String date = scanner.next();
                String driverName = scanner.next();

                statement.setInt(1,cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickUp);
                statement.setTime(4, Time.valueOf(time));
                statement.setDate(5,Date.valueOf(date));
                statement.setString(6,driverName);

                boolean result = statement.execute();
                System.out.println("Values inserted"+!result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
