package ru.coxey.exercise2;

import ru.coxey.exercise2.model.Car;
import ru.coxey.exercise2.model.Person;

public class DeepCloneTask {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person tom = new Person("Tom", 25, new Car("Toyota", 249));
        var bob = new Person(tom);

        bob.setName("Bob");
        bob.setAge(40);
        bob.setCar(new Car("Mercedes", 600));

        System.out.println("Tom: " + tom);
        System.out.println("Bob: " + bob);

        Person vasya = new Person("Vasya", 19, new Car("VAZ", 106));
        var petya = vasya.clone();

        petya.setName("Petya");
        petya.setAge(55);
        petya.setCar(new Car("Lexus", 305));

        System.out.println("Vasya: " + vasya);
        System.out.println("Petya: " + petya);
    }
}
