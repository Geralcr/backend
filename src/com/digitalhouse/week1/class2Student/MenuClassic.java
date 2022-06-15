package com.digitalhouse.week1.class2Student;

public class MenuClassic extends Menu {


    @Override
    public void prepareDish() {
        System.out.println("Menu clasico preparado");
    }

    @Override
    public Double priceCalcuation() {
        System.out.println("Precio total es: "+super.basePrice);
        return super.basePrice;
    }
}
