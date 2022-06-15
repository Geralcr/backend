package com.digitalhouse.week1.class1Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
 @Test
    public void getSizeArrayPeople(){
     //Arrange
     Person Juan = new Person("Juanito","Digital",18);
     Person Pedro = new Person("Pedro","Digital",17);
     Person Ana = new Person("Ana","Digital",22);
     Person Luz = new Person("Luz","Digital",14);
     Person Julian = new Person("Julian","Digital",32);
     Person Natasha = new Person("Natasha","Digital",40);
     People personasClase = new People();
     personasClase.addPerson(Juan);
     personasClase.addPerson(Pedro);
     personasClase.addPerson(Ana);
     personasClase.addPerson(Luz);
     personasClase.addPerson(Julian);
     personasClase.addPerson(Natasha);
     //Act
     Integer sizeResult = personasClase.getPeopleCount();
     Integer size = 3;
     //Assert
     Assertions.assertEquals(size,sizeResult);
 }
 @Test
 public void verifyName(){
  //Arrange
  Person Juan = new Person("N1c0las","Digital",18);
  Person Pedro = new Person("Pedro","Digital",17);
  Person Ana = new Person("Ana","Digital",22);
  Person Luz = new Person("Luz","Digital",14);
  Person Julian = new Person("Julian","Digital",32);
  Person Natasha = new Person("Natasha","Digital",40);
  People personasClase = new People();
  personasClase.addPerson(Juan);
  personasClase.addPerson(Pedro);
  personasClase.addPerson(Ana);
  personasClase.addPerson(Luz);
  personasClase.addPerson(Julian);
  personasClase.addPerson(Natasha);
  //Act
  Integer sizeResult = personasClase.getPeopleCount();
  Integer size = 3;
  //Assert
  assertEquals(size,sizeResult);
 }
 @Test
 public void verifyAgeSize(){
  //Arrange
  Person Juan = new Person("Juanito","Digital",18);
  Person Pedro = new Person("Pedro","Digital",17);
  Person Ana = new Person("Ana","Digital",22);
  Person Luz = new Person("Luz","Digital",14);
  Person Julian = new Person("Julian","Digital",32);
  Person Natasha = new Person("Natasha","Digital",40);
  People personasClase = new People();
  personasClase.addPerson(Juan);
  personasClase.addPerson(Pedro);
  personasClase.addPerson(Ana);
  personasClase.addPerson(Luz);
  personasClase.addPerson(Julian);
  personasClase.addPerson(Natasha);
  //Act
  Integer sizeResult = personasClase.getPeopleCount();
  Integer size = 3;
  //Assert
  Assertions.assertEquals(size,sizeResult);
 }
}