package com.yorku.users;
public class Guest extends User {

    public Guest(String email, String password, String idNumber) {
        super(email, password, idNumber,false);
    }

    @Override
    public double getHourlyRate() {
        return 30;
    }
}
