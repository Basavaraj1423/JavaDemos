package org.docterapp.repository;

import org.docterapp.exceptions.DocterNotFoundException;
import org.docterapp.model.Doctor;
import org.docterapp.util.DocterDb;
import org.docterapp.util.Querries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocterRepositoryImpl implements IDocterRepository {

    @Override
    public void addDocter(Doctor doctor) {
        try (Connection connection = DocterDb.openconnection();
             PreparedStatement statement = connection.prepareStatement(Querries.INSERTQUERRY);
        ) {
            statement.setString(1, doctor.getDocterName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());
            boolean result = statement.execute();
            System.out.println("One row inserted :" + !result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDocter(int docterId, double fees) {


    }

    @Override
    public void deleteDocter(int docterId) {

    }

    @Override
    public void findById(int docterId) {

    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DocterDb.openconnection();
             PreparedStatement statement = connection.prepareStatement(Querries.FINDALLQUERRY);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int doctorId = resultSet.getInt("docter_id");
                String doctorName = resultSet.getString("docter_name");
                String speciality = resultSet.getString("speciality");
                double fees = resultSet.getDouble("fees");
                int ratings = resultSet.getInt("ratings");
                int exp = resultSet.getInt("experience");

                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, exp);
                doctorList.add(doctor);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }


    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DocterDb.openconnection();
             PreparedStatement statement = connection.prepareStatement(Querries.FINDBYSPECIALITYQUERRY);
        ) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDocterId(resultSet.getInt("docter_id"));
                    doctor.setDocterName(resultSet.getString("docter_name"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setSpeciality(resultSet.getString("speciality"));

                    doctorList.add(doctor);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFee(String speciality, double fees) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String docterName) {
        return null;
    }
}
