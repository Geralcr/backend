package com.digitalhouse.week1.class2Teacher;

public abstract class Liquidator {
    public abstract Double calculateSalary(Employee employee);
    public abstract String printVoucher(Employee employee);
    private String bankDeposit(Employee employee){
        return String.format("Fue depositado el salario a la cuenta %d",employee.getAccountNumber());
    }
    public String liquidatorSalary(Employee employee){
        String message = "La liquidación no fue posible realizarla";
        Double salary = this.calculateSalary(employee);
        if (salary >0 ){
            String voucher = this.printVoucher(employee);
            System.out.println(this.bankDeposit(employee));
            message = String.format("La liquidación generada es un %s. Saldo a liquidar: %f",voucher,salary);
        }

        return message;
    }
}
