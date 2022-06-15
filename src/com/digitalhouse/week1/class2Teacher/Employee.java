package com.digitalhouse.week1.class2Teacher;

public abstract class Employee {
    private String name;
    private String lastname;
    private Integer accountNumber;

    public Employee(String name, String lastname, Integer accountNumber) {
        this.name = name;
        this.lastname = lastname;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
