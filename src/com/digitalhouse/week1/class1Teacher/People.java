package com.digitalhouse.week1.class1Teacher;

import java.util.ArrayList;
import java.util.List;


public class People {

    private List<Person> people;

    public People() {
        this.people = new ArrayList<>();
    }

    public Integer getPeopleCount() {
        return people.size();
    }

    public void addPerson (Person p){

        if (p.getAge() >= 18 && p.getName().length() > 5) {
            people.add(p);
            System.out.println("La persona fue agregada");
        } else {
            System.err.println("La persona no cumple las condiciones para ser ageregada");
        }


    }

    public Boolean verifySize(){
        Boolean verify ;
        if (this.getPeopleCount() == 2){
            System.out.println("Cumple con el tamaño del arreglo");
            verify =true;
        }else{
            System.err.println("Tamaño incorrecto");
            verify = false;

        }
        return verify;
    }
}
