package com.digitalhouse.week1.class2Teacher;

public class HiredEmployee extends Employee{
    private Integer numberHour;
    private Double hourlyRate;

    public HiredEmployee(String name, String lastname, Integer accountNumber, Integer numberHour, Double hourlyRate) {
        super(name, lastname, accountNumber);
        this.numberHour = numberHour;
        this.hourlyRate = hourlyRate;
    }

    public Integer getNumberHour() {
        return numberHour;
    }

    public void setNumberHour(Integer numberHour) {
        this.numberHour = numberHour;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
