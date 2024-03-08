package com.voterapp.service;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int vId);
}
