package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

    @Override
    public boolean validatePassword(String password) throws TooLongException, TooShortException {
        if (password.length() < 6) {
            throw new TooShortException("Password is too Short");
        } else if (password.length() > 15) {
            throw new TooLongException("Password is too Long");
        }
        return true;
    }

    @Override
    public boolean validateUserName(String inputName) throws NameExistsException {
        String[] userNames = {"Jhon", "Sansa", "Danarys", "Arya"};
        for (String uname : userNames) {
            if (uname.equals(inputName))
                throw new NameExistsException("Name Exists Already");

        }
        return true;
    }
}

