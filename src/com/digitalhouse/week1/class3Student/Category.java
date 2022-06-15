package com.digitalhouse.week1.class3Student;

public enum Category {
    FRESHMAN("novato"),
    APPRENTICE("aprendiz"),
    GOOD("bueno"),
    MASTER("maestro");

    private String category;
    Category(String category) {
        this.category =category;
    }

    public String getCategory() {
        return category;
    }
}
