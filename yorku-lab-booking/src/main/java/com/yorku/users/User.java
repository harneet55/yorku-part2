package com.yorku.users;

public abstract class User {

    public enum Status { PENDING_APPROVAL, APPROVED, REJECTED }

    protected String email;
    protected String password;
    protected String idNumber;
    protected Status status;
    protected boolean universityAffiliated;

    public User(String email, String password, String idNumber, boolean universityAffiliated) {
        this.email = email;
        this.password = password;
        this.idNumber = idNumber;
        this.universityAffiliated = universityAffiliated;
        this.status = Status.PENDING_APPROVAL;
    }

    public abstract double getHourlyRate();

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isUniversityAffiliated() {
        return universityAffiliated;
    }
}