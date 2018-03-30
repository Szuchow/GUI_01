package com.company;
public class Person {
    String imie;
    int wiek;
    Person person;

    public Person(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public void sayHelloTo(Person person) {
        System.out.println("Hi " + person.imie);
    }




}