package com.digitalhouse.week1.class3Student;

public class Employee extends  Seller{
    private Integer yearOld;
    private Integer numberAfiliate;

    public Employee(String name, Integer numberSales, Integer yearOld, Integer numberAfiliate) {
        super(name, numberSales);
        this.yearOld = yearOld;
        this.numberAfiliate = numberAfiliate;
    }

    public Integer getYearOld() {
        return yearOld;
    }

    public void setYearOld(Integer yearOld) {
        this.yearOld = yearOld;
    }

    @Override
    public Integer sell() {
        return super.getNumberSales() * 5;
    }

    @Override
    public Integer calculatePoints() {
        Integer points = this.numberAfiliate * 10 + this.yearOld * 5 + this.sell();

        return points;
    }

}
