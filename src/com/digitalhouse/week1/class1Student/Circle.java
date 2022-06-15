package com.digitalhouse.week1.class1Student;

public class Circle extends Figure{
    private Double side;

    public Circle(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double calculateArea(Double side) {
        return Math.PI*Math.pow(side,2);
    }

    @Override
    public String areaPerUnits() {
        Double area = calculateArea(this.side);
        return "El área del circulo es "+area;
    }

}
