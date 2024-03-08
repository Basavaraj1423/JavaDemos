package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws NameExistsException, TooLongException, TooShortException {
        IValidationService iValidationService = new ValidationServiceImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name to Register");
        String Inputname = sc.next();
        try {
            if (iValidationService.validateUserName(Inputname)) {
                System.out.println("Enter your Password");
                String password = sc.next();
                if (iValidationService.validatePassword(password)) {
                    System.out.println("Welcome, You are Registered Successfully");
                }
            }
        } catch (NameExistsException e) {
            System.out.println(e.getMessage());
        } catch (TooLongException | TooShortException e) {
            System.out.println(e.getMessage());

        }


    }
}
