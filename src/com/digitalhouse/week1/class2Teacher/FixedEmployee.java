package com.digitalhouse.week1.class2Teacher;

public class FixedEmployee extends Employee{
    private Double basicSalary;
    private Double discounts;
    private Integer numberAwards;

    public FixedEmployee(String name, String lastname, Integer accountNumber, Double basicSalary, Double discounts, Integer numberAwards) {
        super(name, lastname, accountNumber);
        this.basicSalary = basicSalary;
        this.discounts = discounts;
        this.numberAwards = numberAwards;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Double discounts) {
        this.discounts = discounts;
    }

    public Integer getNumberAwards() {
        return numberAwards;
    }

    public void setNumberAwards(Integer numberAwards) {
        this.numberAwards = numberAwards;
    }
}
