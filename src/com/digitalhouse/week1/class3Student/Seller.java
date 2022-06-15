package com.digitalhouse.week1.class3Student;

public abstract class Seller{
    private String name;
    private Integer numberSales;


    public Seller(String name, Integer numberSales) {
        this.name = name;
        this.numberSales = numberSales;

    }

    public abstract Integer sell();
    public abstract Integer calculatePoints();
    public String recategorize(Integer points){
        Category categoryEnum;
        String category= "";
        Boolean apprentice = points < 20;
        Boolean freshman = 20 <= points && points < 30;
        Boolean good = 21 <= points && points < 40;
        Boolean maestro =  points >= 40;
        if (apprentice){
            category = Category.APPRENTICE.getCategory();
        } else if (freshman) {
            category = Category.FRESHMAN.getCategory();
        } else if (good) {
            category = Category.GOOD.getCategory();
        }else {
            category = Category.MASTER.getCategory();
        }
        System.out.println("Category>>>>>>>>"+ category);
        return category;
    }

    public String showCategory(){
        Integer pointsTotal = this.calculatePoints();
        String category = this.recategorize(pointsTotal);
        return String.format("%s tiene un total de %d puntos, categoriza como %s",this.name,pointsTotal,category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(Integer numberSales) {
        this.numberSales = numberSales;
    }
}
