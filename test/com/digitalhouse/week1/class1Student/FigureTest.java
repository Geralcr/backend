package com.digitalhouse.week1.class1Student;
import com.digitalhouse.week1.class1Student.Circle;
import com.digitalhouse.week1.class1Student.Square;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FigureTest {
    @Test
    public void calculateAreCircle(){
        Double radio = 10.0;
        Circle circulo = new Circle(radio);
        String responseExpect = "El área del circulo es 314.1592653589793";
        String responseMethod = circulo.areaPerUnits();
        Assertions.assertEquals(responseExpect,responseMethod);


    }
    @Test
    public void calculateAreSquare(){
        Double side = 10.0;
        Square cuadrado = new Square(side);
        String responseExpect = "El área del cuadrado es 100.0";
        String responseMethod = cuadrado.areaPerUnits();
        Assertions.assertEquals(responseExpect,responseMethod);
    }
}