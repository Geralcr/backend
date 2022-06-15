package com.digitalhouse.week1.class2Teacher;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LiquidatorFixedEmployeeTest {
    @Test
    public void fixecEmployee_method_liquidatorSalary(){
        //Arrange
        FixedEmployee fixedEmployee = new FixedEmployee("Martín","Martini",12345,400.0,40.0,60);
        LiquidatorFixedEmployee liquidatorFixedEmployee = new LiquidatorFixedEmployee();
        String resultFixed = liquidatorFixedEmployee.liquidatorSalary(fixedEmployee);
        //Act
        String responseFixed = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.000000";
        //Assert
        assertEquals(responseFixed,resultFixed);
    }










}