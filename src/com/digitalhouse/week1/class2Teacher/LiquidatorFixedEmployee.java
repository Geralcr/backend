package com.digitalhouse.week1.class2Teacher;

public class LiquidatorFixedEmployee extends Liquidator{
    @Override
    public Double calculateSalary(Employee employee) {
        Double salary= 0.0;

        if (employee instanceof FixedEmployee){
            FixedEmployee fixedEmployee = (FixedEmployee) employee;
            salary = fixedEmployee.getBasicSalary() + fixedEmployee.getNumberAwards() - fixedEmployee.getDiscounts() ;

        }
        return salary;
    }

    @Override
    public String printVoucher(Employee employee) {
        return "documento impreso";
    }
}
