package com.yorku.users;
public class Researcher extends User{
    public Researcher(String email, String password, String idNumber) {
        super(email, password, idNumber,true);
    }

    @Override
    public double getHourlyRate() {
        return 20;

        }   
}
