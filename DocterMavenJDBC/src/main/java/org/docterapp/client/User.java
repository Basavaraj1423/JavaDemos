package org.docterapp.client;

import org.docterapp.exceptions.DocterNotFoundException;
import org.docterapp.model.Doctor;
import org.docterapp.model.Specialization;
import org.docterapp.service.DocterServiceImpl;
import org.docterapp.service.IDocterService;

import java.util.List;

public class User {
    public static void main(String[] args) throws DocterNotFoundException {
        IDocterService docterService = new DocterServiceImpl();
        String specialization = Specialization.CARDIO.getSpeciality();
        Doctor doctor = new Doctor("Steeve",specialization,900,5,15);
        //docterService.addDocter(doctor);
        List<Doctor> doctorList = docterService.getAll();
        for (Doctor doctors : doctorList){
            System.out.println(doctors);
        }
        List<Doctor> doctors = docterService.getBySpeciality("CARDIOLOGY");
        for (Doctor specialityOfDoctors : doctors){
            System.out.println(specialityOfDoctors);
        }
    }
}
