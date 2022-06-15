package com.digitalhouse.week1.class3Student;

public class Affiliated extends  Seller{
    public Affiliated(String name, Integer numberSales) {
        super(name, numberSales);
    }

    @Override
    public Integer sell() {
        return super.getNumberSales() * 5;
    }

    @Override
    public Integer calculatePoints() {
        return this.sell();
    }
}


