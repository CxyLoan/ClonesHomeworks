package ru.coxey.exercise1;

import ru.coxey.exercise1.model.Person;

public class NewbieHomework {

    public static void main(String[] args) {
        Person tom = new Person("Tom", 25);
        Person bob = new Person(tom);
        bob.setName("Bob");
        bob.setAge(18);

        System.out.println("Tom: " + tom);
        System.out.println("Bob: " + bob);

        Person vasya = new Person("Vasya", 40);
        try {
            var petya = vasya.clone();
            petya.setName("Petya");
            petya.setAge(1);

            System.out.println("Vasya: " + vasya);
            System.out.println("Petya: " + petya);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
