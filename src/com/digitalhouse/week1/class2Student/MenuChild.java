package com.digitalhouse.week1.class2Student;

public class MenuChild extends Menu{

    private Integer numberToys;
    private Double priceNeto;

    public MenuChild(Integer numberToys) {
        this.numberToys = numberToys;
        this.priceNeto = 0.0;
    }

    @Override
    public void prepareDish() {
        System.out.println("Menu infantil preparado");
    }

    @Override
    public Double priceCalcuation() {
        priceNeto += super.basePrice + this.numberToys * 3;
        System.out.println("Precio total es: "+priceNeto);

        return priceNeto;
    }
}
