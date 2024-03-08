package com.voterapp.service;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vId) {

        return true;
    }
    private boolean checkAge(int age){
        if(age < 18){
            //throw new
        }
        return true;
    }
}
