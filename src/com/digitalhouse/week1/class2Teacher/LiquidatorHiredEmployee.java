package com.digitalhouse.week1.class2Teacher;

public class LiquidatorHiredEmployee  extends Liquidator{
    @Override
    public Double calculateSalary(Employee employee) {
        Double salary= 0.0;

        if (employee instanceof HiredEmployee){
            HiredEmployee hiredEmployee = (HiredEmployee) employee;
            salary = hiredEmployee.getHourlyRate() * hiredEmployee.getNumberHour() ;
        }
        return salary;


    }

    @Override
    public String printVoucher(Employee employee) {
        return "documento digital";
    }
}
