package ru.coxey.exercise5;

import ru.coxey.exercise5.model.Employee;

public class CashTask {

    public static void main(String[] args) {
        var original = new Employee("Ivan", 25);
        var clone = original.getClone();

        clone.setName("Petya");
        clone.setAge(80);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);

        var cloneOriginal = new Employee("Petya", 80);
        var clonePetya = cloneOriginal.getClone();

        System.out.println("ClonePetya: " + clonePetya);

        clonePetya.setName("Ne Petya");

        System.out.println("После изменения clone: " + clone);
        System.out.println("После изменения clonePetya: " + clonePetya);
    }
}
