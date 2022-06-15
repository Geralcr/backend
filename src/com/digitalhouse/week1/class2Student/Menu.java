package com.digitalhouse.week1.class2Student;

public abstract class Menu {
    protected static Double basePrice = 0.0;



    public abstract void prepareDish();
    public abstract Double priceCalcuation();

    public static void setBasePrice(Double basePrice){
        Menu.basePrice =basePrice;
    }

}
