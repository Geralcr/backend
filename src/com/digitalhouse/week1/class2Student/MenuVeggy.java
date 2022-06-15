package com.digitalhouse.week1.class2Student;

public class MenuVeggy extends Menu{

    protected Boolean spices;
    protected Integer numberSauce;

    private Double priceNeto;

    public MenuVeggy( Boolean spices, Integer numberSauce) {

        this.spices = spices;
        this.numberSauce = numberSauce;
        this.priceNeto = 0.0;
    }

    @Override
    public void prepareDish() {
        System.out.println("Menu vegetariano preparado");
    }

    @Override
    public Double priceCalcuation() {

        priceNeto += super.basePrice + this.numberSauce * 2 + super.basePrice*0.01;
        System.out.println("Precio total es: "+priceNeto);

        return priceNeto;
    }
}
