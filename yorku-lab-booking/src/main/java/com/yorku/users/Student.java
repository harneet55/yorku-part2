package com.yorku.users;
public class Student extends User{
     public Student(String email, String password, String idNumber) {
        super(email, password, idNumber, true);
    }

    @Override
    public double getHourlyRate() {
        return 10;
    }
}
